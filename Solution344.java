import java.util.Arrays;

/**
 * Created by Alex on 2016/5/19.
 */
public class Solution344 {
    public String reverseString(String s) {
        char[] input = s.toCharArray();
        int left = 0;
        int right = input.length-1;
        while(left < right){
            char temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : input){
            sb.append(c);
        }
        return sb.toString();
    }
}
