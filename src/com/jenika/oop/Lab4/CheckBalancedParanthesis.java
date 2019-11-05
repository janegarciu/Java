package com.jenika.oop.Lab4;
import java.util.Arrays;
import java.util.Stack;


public class CheckBalancedParanthesis {

    public  String CheckIfBalanced(String expr)
    {
        if (expr.isEmpty())
            return "Balanced";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char current = expr.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']') {
                if (stack.isEmpty())
                    return "Not Balanced";
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return "Not Balanced";
            }
        }
        return stack.isEmpty()?"Balanced":"Not Balanced";
    }

}
