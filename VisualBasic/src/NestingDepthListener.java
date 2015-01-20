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

import VB6.VisualBasic6BaseListener;
import VB6.VisualBasic6Parser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by creimann on 1/19/2015.
 */
public class NestingDepthListener extends CodeComplexityListener {
    HashMap<String, Integer> nestingLevel = new HashMap<String, Integer>();
    String _currentFunction = null;
    int _currentLevel = 0;
    int _maxLevel = 0;

    public void printNestingsWithThreshold(int threshold) {
        int longestKeyLength = 0;
        String formatString;

        for(String key : nestingLevel.keySet()) {
            if (key.length() > longestKeyLength) {
                longestKeyLength = key.length();
            }
        }
        formatString = "%-" + longestKeyLength + "s %d";

        System.out.println("Nestings:");
        System.out.println("---------");
        for(Map.Entry<String, Integer> entry : nestingLevel.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println(String.format(formatString, entry.getKey(), entry.getValue()));
            }
        }
    }

    public void printNestings() {
        printNestingsWithThreshold(3);
    }

    @Override
    protected void beginFunction(String functionName) {
        _currentFunction = functionName;
        _currentLevel = _maxLevel = 1;
    }

    @Override
    protected void endFunction() {
        nestingLevel.put(_currentFunction, _maxLevel);

        _currentFunction = null;
    }

    @Override
    public void enterBlock(@NotNull VisualBasic6Parser.BlockContext ctx) {
        _currentLevel += 1;
        if (_currentLevel > _maxLevel) {
            _maxLevel = _currentLevel;
        }

        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(@NotNull VisualBasic6Parser.BlockContext ctx) {
        _currentLevel -= 1;

        super.exitBlock(ctx);
    }
}
