import java.util.Stack;

/**
 * Created by Alex on 2016/5/19.
 */
public class Solution227 {
    public int calculate(String s) {
        String RPNString = getRPN(s);
        String[] data = RPNString.split(" ");
        Stack<Integer> stack = new Stack<>();
        for(String element : data){
            if(element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                switch (element){
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(b-a);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(b/a);
                        break;
                }
            }else{
                stack.push(Integer.parseInt(element));
            }
        }
        return stack.pop();
    }

    public String getRPN(String s){
        Stack<Character> stack = new Stack<>();
        char[] input = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : input){
            if(c ==' '){
                continue;
            }
            if(c>='0' && c<='9'){
                sb.append(c);
            }else {
                sb.append(" ");
                if(c=='*' || c=='/'){
                    while(!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')){
                        sb.append(stack.pop());
                        sb.append(" ");
                    }
                    stack.push(c);
                }
                if(c=='+' || c=='-'){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                        sb.append(" ");
                    }
                    stack.push(c);
                }
            }
        }
        while(!stack.isEmpty()){
            sb.append(" ");
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
