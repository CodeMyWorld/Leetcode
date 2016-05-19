/**
 * Created by Alex on 2016/5/19.
 */
public class Solution28 {
    public int strStr(String haystack, String needle) {
        char[] haystackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();
        if(haystackChar.length == 0 && needleChar.length == 0){
            return 0;
        }
        if(haystackChar.length == 0){
            return -1;
        }
        if(needleChar.length == 0){
            return 0;
        }

        for(int i=0; i<=haystackChar.length - needleChar.length; i++){
            boolean flag = true;
            int index = i;
            int result = i;
            for(int j=0; j<needleChar.length; j++){
                if(haystackChar[index] == needleChar[j]){
                    index++;
                }else {
                    flag = false;
                    break;
                }
            }
            if(flag){
                return result;
            }
        }
        return -1;
    }
}
