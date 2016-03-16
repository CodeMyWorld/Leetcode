import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 2016/3/16.
 */
public class Solution264 {
    public int nthUglyNumber(int n) {

        List<Double> result = new ArrayList<>();
        result.add(1.0);
        for (int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                double temp;
                if(j == 0){
                    temp = result.get(i) * 2;
                }else if(j == 1){
                    temp = result.get(i) * 3;
                }else{
                    temp = result.get(i) * 5;
                }

                for(int k=i; k<result.size(); k++){
                    if(temp == result.get(k)){
                        break;
                    }
                    if(k == result.size()-1){
                        result.add(temp);
                        break;
                    }
                    if(temp > result.get(k) && temp < result.get(k+1)){
                        result.add(k+1, temp);
                        break;
                    }
                }
            }
        }
        return result.get(n-1).intValue();
    }
}
