package StacksQueues;

import java.util.Stack;

public class Brackets {

//  A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
//  S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
//  S has the form "VW" where V and W are properly nested strings.

    public static int solution(String s){
        //special case
        if(s.length() == 0){
            return 1;
        }

        Stack<Character> stack = new Stack<>();

        // scan the string (just one pass)
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == '('){
                stack.push(')');
            }else if(s.charAt(i) == '['){
                stack.push(']');
            }else if(s.charAt(i) == '{'){
                stack.push('}');
            }
            // pop and check
            else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}' ){
                if (stack.isEmpty() == true){
                    return 0;
                }else {
                    char temp = stack.pop();
                    if (temp != s.charAt(i)){
                        return 0;
                    }
                }
            }
        }

        if (!stack.isEmpty()){
            return 0;
        }else {
            return 1;
        }

    }


    public static void main(String[] args) {
        String s = "{[()()]}";
        System.out.println(solution(s));
    }

}
