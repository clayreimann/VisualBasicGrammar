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

/**
 * Created by creimann on 1/20/2015.
 */
public abstract class CodeComplexityListener extends VB6.VisualBasic6BaseListener {
    protected abstract void beginFunction(String functionName);

    protected abstract void endFunction();

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