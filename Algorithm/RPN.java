package Algorithm;

import java.util.Stack;

/**
 * Created by Alex on 2016/5/19.
 */
public class RPN {
    public static void main(String[] argv){
        System.out.println(getRPN("a+b*c+(d*e+f)*g"));
    }

    public static String getRPN(String input){
        char[] inputChar = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : inputChar){
            if(c>='a' && c <='z'){
                sb.append(c);
            }else{
                if(c == '*' || c == '/'){
                    while(!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')){
                        sb.append(stack.pop());
                    }
                    stack.push(c);
                }else if(c == '+' || c=='-'){
                    while (!stack.isEmpty() && stack.peek() != '('){
                        sb.append(stack.pop());
                    }
                    stack.push(c);
                }else if(c == '('){
                    stack.push(c);
                }else if( c == ')'){
                    while(stack.peek() != '('){
                        sb.append(stack.pop());
                    }
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
