

/**
 * Created by Alex on 2017/3/17.
 */
public class Solution38 {
    public String countAndSay(int n) {
        if(n == 0){
            return null;
        }else {
            n--;
        }
        String number = "1";
        for(int i = 0; i < n; i++){
            String currentNumber = number.substring(0, 1);
            int times = 0;
            StringBuilder result = new StringBuilder();
            for(int j = 0; j < number.length(); j++){
                String tempNumber = number.substring(j, j+1);
                if(tempNumber.equals(currentNumber)){
                    times++;
                }else {
                    result.append(times);
                    result.append(currentNumber);
                    currentNumber = tempNumber;
                    times = 1;
                }
            }
            result.append(times);
            result.append(currentNumber);
            number = result.toString();
        }
        return number;
    }
}
