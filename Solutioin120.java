import java.util.List;

/**
 * Created by Alex on 2016/2/29.
 */
public class Solutioin120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size()-1; i >= 0; i--){
            for(int j = 0; j < triangle.get(i).size(); j++){
                if(i != triangle.size()-1){
                    int number = triangle.get(i).get(j);
                    int left = triangle.get(i+1).get(j);
                    int right = triangle.get(i+1).get(j+1);
                    if(left > right){
                        number += right;
                    }else{
                        number += left;
                    }
                    triangle.get(i).set(j,number);
                }
            }
        }
        return triangle.get(0).get(0);
    }
}
