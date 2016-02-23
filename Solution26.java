/**
 * Created by alex on 16-2-23.
 */

//[1,1,2,3,3,4]
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int result = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                result++;
                nums[result] = nums[i+1];
            }
        }
        return result+1;
    }
}
