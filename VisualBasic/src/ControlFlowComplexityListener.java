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
 * Created by Clay Reimann on 1/20/2015
 *
 * Control Flow Complexity (CFC) is similar to Cyclomatic Complexity (CC) and is described in
 * the paper "What Does Control Flow Really Look Like? Eyeballing the Cyclomatic Complexity Metric"
 * by Jurgen Vinju and Michael Godfrey (DOI: http://dx.doi.org/10.1109/SCAM.2012.17)
 */
public class ControlFlowComplexityListener extends CodeComplexityListener {
    private String m_CurrentFunctionName;
    private int m_FlowPointsCount;

    public ControlFlowComplexityListener() {
        m_DefaultThreshold = 10;
        m_MetricName = "Control Flow Complexity";
    }

    private void foundFlowPoint() {
        m_FlowPointsCount += 1;
    }

    @Override
    protected void beginFunction(String functionName) {
        m_CurrentFunctionName = functionName;
        m_FlowPointsCount = 1; // every function starts at complexity 1
    }

    @Override
    protected void endFunction() {
        m_CodeMetrics.put(m_CurrentFunctionName, m_FlowPointsCount);

        m_CurrentFunctionName = null;
    }

    //
    //  traditional (CC) flow points
    //
    @Override
    public void enterIfStatement(@NotNull VisualBasic6Parser.IfStatementContext ctx) {
        foundFlowPoint();
    }

    @Override
    public void enterIfClause(@NotNull VisualBasic6Parser.IfClauseContext ctx) {
        foundFlowPoint();
    }

    @Override
    public void enterElseIfClause(@NotNull VisualBasic6Parser.ElseIfClauseContext ctx) {
        foundFlowPoint();
    }

    @Override
    public void enterLoopStmt(@NotNull VisualBasic6Parser.LoopStmtContext ctx) {
        foundFlowPoint();
    }

    @Override
    public void enterCaseClause(@NotNull VisualBasic6Parser.CaseClauseContext ctx) {
        foundFlowPoint();
    }

    @Override
    public void enterCaseElseStmt(@NotNull VisualBasic6Parser.CaseElseStmtContext ctx) {
        foundFlowPoint();
    }

    //
    //  additional flow points for CFC
    //
    @Override
    public void enterErrorStmt(@NotNull VisualBasic6Parser.ErrorStmtContext ctx) {
        // the error handler block is a jump point
        if (ctx.identifier() != null) {
            foundFlowPoint();
        }
    }

    @Override
    public void enterExitStmt(@NotNull VisualBasic6Parser.ExitStmtContext ctx) {
        foundFlowPoint();
    }
}
