package task3_ParenthesesMatching;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ASUS on 25.11.2016 г..
 */
public class Task3_ParenthesesMatching {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean input = true;
        String str = scn.nextLine();
        int l = str.length();
        input = true;
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < l; i++) {
            String checkMatch = str.substring(i, i + 1);
            if (checkMatch.equals("(")) {
                stack.push(checkMatch);
            } else if (checkMatch.equals("{")) {
                stack.push(checkMatch);
            } else if (checkMatch.equals("[")) {
                stack.push(checkMatch);
            } else if (checkMatch.equals(")")) {
                if (stack.empty()) {
                    input = false;
                    break;
                }
                if (stack.peek().equals("(")) {
                    stack.pop();
                } else {
                    input = false;
                    break;
                }
            } else if (checkMatch.equals("}")) {
                if (stack.empty()) {
                    input = false;
                    break;
                }
                if (stack.peek().equals("{")) {
                    stack.pop();
                } else {
                    input = false;
                    break;
                }
            } else if (checkMatch.equals("]")) {
                if (stack.empty()) {
                    input = false;
                    break;
                }
                if (stack.peek().equals("[")) {
                    stack.pop();
                } else {
                    input = false;
                    break;
                }
            }
        }
        if (input && stack.empty())
            System.out.println("True");
        else
            System.out.println("False");
    }
}
