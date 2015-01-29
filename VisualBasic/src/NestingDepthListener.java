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

import java.util.Map;

/**
 * Created by Clay Reimann on 1/19/2015.
 */
public class NestingDepthListener extends CodeComplexityListener {
    String m_CurrentFunction = null;
    int m_CurrentLevel = 0;
    int m_MaxLevel = 0;

    public NestingDepthListener() {
        m_DefaultThreshold = 4;
        m_MetricName = "Nesting Level";
    }

    @Override
    protected void beginFunction(String functionName) {
        m_CurrentFunction = functionName;
        m_CurrentLevel = m_MaxLevel = 1;
    }

    @Override
    protected void endFunction() {
        m_CodeMetrics.put(m_CurrentFunction, m_MaxLevel);

        m_CurrentFunction = null;
    }

    @Override
    public void enterBlock(@NotNull VisualBasic6Parser.BlockContext ctx) {
        m_CurrentLevel += 1;
        if (m_CurrentLevel > m_MaxLevel) {
            m_MaxLevel = m_CurrentLevel;
        }

        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(@NotNull VisualBasic6Parser.BlockContext ctx) {
        m_CurrentLevel -= 1;

        super.exitBlock(ctx);
    }
}
