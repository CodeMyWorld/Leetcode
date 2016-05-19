import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alex on 2016/4/1.
 */
public class Solution223 {
    public int solution(int N) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        int temp = N;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        System.out.println(count);
        int result = count;
        for (int i = count - 1; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }
}
