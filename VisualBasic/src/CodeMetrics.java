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

        BufferedReader fs = new BufferedReader(new FileReader(filePath));
        System.out.println("Parsing file: " + filePath);

        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(fs);

        // create a lexer that feeds off of input CharStream
        VisualBasic6Lexer lexer = new VisualBasic6Lexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // parse the file
        VisualBasic6Parser parser = new VisualBasic6Parser(tokens);
        ParseTree tree = parser.file();
        ParseTreeWalker walker = new ParseTreeWalker();

        CyclomaticComplexityListener complexity = new CyclomaticComplexityListener();
        walker.walk(complexity, tree);
        complexity.printComplexities();

        System.out.println();
        System.out.println();
        System.out.println();

        NestingDepthListener nesting = new NestingDepthListener();
        walker.walk(nesting, tree);
        nesting.printNestings();
    }
}
