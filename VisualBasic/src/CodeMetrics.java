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

/**
 * Created by creimann on 1/19/2015.
 */

import VB6.VisualBasic6Lexer;
import VB6.VisualBasic6Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class CodeMetrics {

    public static void main(String[] args) throws Exception {
        String filePath;

        if (args.length > 0) {
            filePath = args[0];
        } else {
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            filePath = console.readLine();
        }

        ComplexityListenerAggregator aggregator = new ComplexityListenerAggregator();

        CyclomaticComplexityListener complexity = new CyclomaticComplexityListener();
        aggregator.addListener(complexity);

        NestingDepthListener nesting = new NestingDepthListener();
        aggregator.addListener(nesting);

        ControlFlowComplexityListener flowComplexity = new ControlFlowComplexityListener();
        aggregator.addListener(flowComplexity);

        aggregator.analyzeFile(filePath);

        nesting.printResults();
        System.out.println();

        complexity.printResults();
        System.out.println();

        flowComplexity.printResults();
        System.out.println();
    }
}
