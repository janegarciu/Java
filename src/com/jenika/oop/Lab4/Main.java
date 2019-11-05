package com.jenika.oop.Lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

            CheckBalancedParanthesis check = new CheckBalancedParanthesis();
            List<String> testStrings = Reader.readFile("three_expressions");
            testStrings.forEach(testString-> System.out.println(check.CheckIfBalanced(testString)));
    }
}