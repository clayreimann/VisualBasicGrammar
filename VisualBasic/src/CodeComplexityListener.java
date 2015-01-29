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
import com.sun.deploy.util.StringUtils;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by creimann on 1/20/2015.
 */
public abstract class CodeComplexityListener extends VB6.VisualBasic6BaseListener {
    protected Integer m_DefaultThreshold = 1;
    protected String m_MetricName;
    protected HashMap<String, Integer> m_CodeMetrics = new HashMap<String, Integer>();

    protected abstract void beginFunction(String functionName);
    protected abstract void endFunction();


    public void printResultsWithThreshold(Integer threshold) {
        String formatString = getFormatString();

        System.out.println(m_MetricName);
        System.out.println(new String(new char[m_MetricName.length()]).replace("\0", "-"));
        for (Map.Entry<String, Integer> entry: m_CodeMetrics.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println(String.format(formatString, entry.getKey(), entry.getValue()));
            }
        }
    }
    public void printResults() {
        printResultsWithThreshold(m_DefaultThreshold);
    }

    protected String getFormatString() {
        int longestKeyLength = 0;

        for(String key : m_CodeMetrics.keySet()) {
            if (key.length() > longestKeyLength) {
                longestKeyLength = key.length();
            }
        }
        return "%-" + longestKeyLength + "s %d";
    }

    @Override
    public void enterFunctionDeclaration(@NotNull VisualBasic6Parser.FunctionDeclarationContext ctx) {
        beginFunction(ctx.identifier().getText());
    }

    @Override
    public void enterSubDeclaration(@NotNull VisualBasic6Parser.SubDeclarationContext ctx) {
        beginFunction(ctx.identifier().getText());
    }

    @Override
    public void enterPropertyDeclaration(@NotNull VisualBasic6Parser.PropertyDeclarationContext ctx) {
        beginFunction(ctx.identifier().getText());
    }

    //
    //  Find all the exit points
    //
    @Override
    public void exitFunctionDeclaration(@NotNull VisualBasic6Parser.FunctionDeclarationContext ctx) {
        endFunction();
    }

    @Override
    public void exitSubDeclaration(@NotNull VisualBasic6Parser.SubDeclarationContext ctx) {
        endFunction();
    }

    @Override
    public void exitPropertyDeclaration(@NotNull VisualBasic6Parser.PropertyDeclarationContext ctx) {
        endFunction();
    }
}
