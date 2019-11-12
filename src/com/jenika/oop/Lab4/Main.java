package com.jenika.oop.Lab4;

import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        ParanthesisChecker checker = new ParanthesisChecker();
        List<String> expressions = Reader.readFile("three_expressions");

        expressions.forEach(expression -> System.out.println(
                "Is " +
                        (checker.isBalanced(expression) ? "" : "not") +
                        " Balanced"));
    }
}