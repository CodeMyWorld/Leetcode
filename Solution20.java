import java.util.Stack;

/**
 * Created by alex on 16-2-22.
 */
public class Solution20 {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            String character = s.substring(i, i+1);
            switch (character){
                case ")":
                    if(stack.isEmpty())
                        return false;
                    if(stack.peek().equals("(")){
                        stack.pop();
                    }else{
                        stack.push(character);
                    }
                    break;
                case "}":
                    if(stack.isEmpty())
                        return false;
                    if(stack.peek().equals("{")){
                        stack.pop();
                    }else{
                        stack.push(character);
                    }
                    break;
                case "]":
                    if(stack.isEmpty())
                        return false;
                    if(stack.peek().equals("[")){
                        stack.pop();
                    }else{
                        stack.push(character);
                    }
                    break;
                default:
                    stack.push(character);
            }
        }
        return stack.isEmpty();
    }
}
