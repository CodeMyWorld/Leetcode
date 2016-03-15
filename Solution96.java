/**
 * Created by Alex on 2016/3/15.
 */
public class Solution96 {
    public int numTrees(int n) {
        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 1;
        for(int i=0 ; i <=n; i++){
            if(i>1){
                int temp = 0;
                for(int j=0; j<i; j++){
                    temp += result[j] * result[i-j-1];
                }
                result[i] = temp;
            }
        }
        return result[n];
    }
}
