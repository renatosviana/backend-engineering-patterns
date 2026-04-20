package algorithms.stack;

import java.util.Stack;

public class ValidParenthesesSolution {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // push opening brackets
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // if stack is empty, no matching opening
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // check matching pairs
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }

        // valid only if no unmatched openings remain
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}