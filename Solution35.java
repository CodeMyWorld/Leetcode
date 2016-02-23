/**
 * Created by alex on 16-2-23.
 */
//[1,3,5,6], 5 → 2
//[1,3,5,6], 2 → 1
//[1,3,5,6], 7 → 4
//[1,3,5,6], 0 → 0
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        return search(nums, 0, nums.length-1, target);
    }
    public int search(int[] nums, int left, int right, int target){
        if(left < right){
            int mid = (left+right)/2;
            if(nums[mid] > target){
                return search(nums, left, mid, target);
            } else if(nums[mid] < target){
                return search(nums, mid+1, right, target);
            }else {
              return mid;
            }
        }else{
            int mid = (left+right)/2;
            if(nums[mid] > target){
                return mid == 0 ? 0 : mid;
            }else if(nums[mid] == target){
                return mid;
            }else {
                return mid+1;
            }
        }
    }
}
