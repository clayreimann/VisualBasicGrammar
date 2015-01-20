/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import VB6.VisualBasic6Parser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by creimann on 1/19/2015.
 */
public class CyclomaticComplexityListener extends CodeComplexityListener {
    String m_CurrentFunction;
    int m_ExitPoints, m_DecisionPoints;
    HashMap<String, Integer> complexityCount = new HashMap<String, Integer>();

    public void printComplexitiesWithThreshold(int threshold) {
        int longestKeyLength = 0;
        String formatString;

        for(String key : complexityCount.keySet()) {
            if (key.length() > longestKeyLength) {
                longestKeyLength = key.length();
            }
        }
        formatString = "%-" + longestKeyLength + "s %d";

        System.out.println("Complexities:");
        System.out.println("-------------");
        for (Map.Entry<String, Integer> entry: complexityCount.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println(String.format(formatString, entry.getKey(), entry.getValue()));
            }
        }
    }

    public void printComplexities() {
        printComplexitiesWithThreshold(10);
    }
    private void foundDecisionPoint() {
        m_DecisionPoints += 1;
    }
    private void foundExitPoint() {
        m_ExitPoints += 1;
    }

    @Override
    protected void beginFunction(String functionName) {
        m_CurrentFunction = functionName;
        m_DecisionPoints = 0;
        m_ExitPoints = 0;
    }

    @Override
    protected void endFunction() {
        foundExitPoint();

        // from http://en.wikipedia.org/wiki/Cyclomatic_complexity
        int complexity = m_DecisionPoints - m_ExitPoints + 2;
        complexityCount.put(m_CurrentFunction, complexity);

        m_CurrentFunction = null;
    }

    @Override
    public void enterExitStmt(@NotNull VisualBasic6Parser.ExitStmtContext ctx) {
        foundExitPoint();
    }

    //
    //  Find all the decision points
    //
    private void findLogicalAtoms(VisualBasic6Parser.ExpressionContext ctx) {
        // conjunction operators indicate another decision point
        if (ctx.conjunctionOp != null) {
            foundDecisionPoint();

            // recurse through any nested expressions
            for (VisualBasic6Parser.ExpressionContext c : ctx.expression()) {
                findLogicalAtoms(c);
            }
        }
    }

    @Override
    public void enterIfStatement(@NotNull VisualBasic6Parser.IfStatementContext ctx) {
        foundDecisionPoint();
        findLogicalAtoms(ctx.expression());

        if (ctx.ELSE() != null) {
            foundDecisionPoint();
        }
    }

    @Override
    public void enterIfClause(@NotNull VisualBasic6Parser.IfClauseContext ctx) {
        foundDecisionPoint();
        findLogicalAtoms(ctx.expression());
    }

    @Override
    public void enterElseIfClause(@NotNull VisualBasic6Parser.ElseIfClauseContext ctx) {
        foundDecisionPoint();
        findLogicalAtoms(ctx.expression());
    }

    @Override
    public void enterCaseClause(@NotNull VisualBasic6Parser.CaseClauseContext ctx) {
        for(VisualBasic6Parser.CaseClauseContext c : ctx.caseClause()) {
            foundDecisionPoint();
        }
    }

    @Override
    public void enterCaseElseStmt(@NotNull VisualBasic6Parser.CaseElseStmtContext ctx) {
        foundDecisionPoint();
    }

    @Override
    public void enterForLoop(@NotNull VisualBasic6Parser.ForLoopContext ctx) {
        foundDecisionPoint();
    }

    @Override
    public void enterDoWhileLoop(@NotNull VisualBasic6Parser.DoWhileLoopContext ctx) {
        foundDecisionPoint();
        findLogicalAtoms(ctx.expression());
    }

    @Override
    public void enterWhileLoop(@NotNull VisualBasic6Parser.WhileLoopContext ctx) {
        foundDecisionPoint();
        findLogicalAtoms(ctx.expression());
    }

    @Override
    public void enterErrorStmt(@NotNull VisualBasic6Parser.ErrorStmtContext ctx) {
        // if we're going to jump to a label on error it is likely that we have an exit statement
        // guarding that block so we'll compensate by counting the On Error statement as a decision point
        if (ctx.identifier() != null) {
            foundDecisionPoint();
        }
    }
}
