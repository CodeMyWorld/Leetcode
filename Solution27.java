/**
 * Created by alex on 16-2-23.
 */

//1,1,2,3,4,5,4,6
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            if(nums[left] != val){
                result++;
                left++;
            }else {
                while(right >= left &&nums[right] == val){
                    right--;
                }
                if(right > left){
                    nums[left] = nums[right];
                    result++;
                    right--;
                    left++;
                }

            }
        }
        return result;
    }
}
