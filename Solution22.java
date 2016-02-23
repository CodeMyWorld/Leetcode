import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Alex on 2016/2/22.
 */
public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generateParenthesis("", n, 0, 0, result);
        return result;
    }

    public void generateParenthesis(String temp, int n, int left, int right, List<String> result){

        if(left < n){

            generateParenthesis(temp+"(", n, left+1, right, result);
        }
        if(right < n){
            generateParenthesis(temp+")", n, left, right+1, result);
        }
        if(left == n && right == n){
            Stack<String> stack = new Stack<String>();
            for(int i = 0; i < temp.length(); i++){
                String character = temp.substring(i, i+1);
                if(character.equals(")") && !stack.isEmpty() && stack.peek().equals("(")){
                    stack.pop();
                }else {
                    stack.push(character);
                }
            }
            if(stack.isEmpty()){
                result.add(temp);
            }
        }
    }
}
