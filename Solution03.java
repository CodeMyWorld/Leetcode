import java.util.HashMap;
import java.util.Map;


/**
 * Created by Alex on 2016/5/19.
 */
public class Solution03 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] input = s.toCharArray();
        int index = 0;
        int result = 0;
        int currentLength = 0;

        while(index != input.length-1){
            if(!map.containsKey(input[index])){
                map.put(input[index], index);
                index++;
                currentLength++;
            }else {
                if(currentLength > result){
                    result = currentLength;
                }
                index = map.get(input[index]) + 1;
                map.clear();
                currentLength = 0;
            }
        }
        if(currentLength > result){
            result = currentLength;
        }
        return result;
    }
}
