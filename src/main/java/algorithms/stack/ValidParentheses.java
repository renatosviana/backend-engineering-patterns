package algorithms.stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String [] args) {
        String s = "()";

        Stack<Character> stack = new Stack();

        for(int i=0; i < s.length(); i++) {
//            char character = s.charAt(i);
            System.out.println("s.charAt(i) => " + s.charAt(i));
            if (s.charAt(i) == '(') {
              stack.push(s.charAt(i));
            } else {
               if (stack.peek() == ')')
                   System.out.println("It matches "+stack.peek());
                   return;
            }

        }

//        while(!stack.isEmpty()) {
//            System.out.println(stack.pop());
////            if (stack.pop() == )
//            //first time will be ")", but I need to check if the other is "(" so ne to get pop again?
//            switch(stack.pop()) {
//                case ")":
//                    if
//            }
//        }

    }



}
