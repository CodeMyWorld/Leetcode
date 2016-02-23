/**
 * Created by alex on 16-2-23.
 */
//Given [5, 7, 7, 8, 8, 10] and target value 8,
//        return [3, 4].
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int [] result = new int[2];
        search(nums, target, 0, nums.length-1, result);
        return result;
    }

    public void search(int[] nums, int target, int left, int right, int[] result){
        if(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] < target){
                search(nums, target, mid+1, right, result);
            }else if(nums[mid] > target){
                search(nums, target, left, mid, result);
            }else {
                result[0] = result[1] = mid;
                while(result[0] >0 && nums[result[0]-1] == target){
                    result[0]--;
                }
                while(result[1] < nums.length-1 && nums[result[1] + 1] == target){
                    result[1]++;
                }
            }
        }else {
            if(nums[left] == target){
                result[0] = result[1] = left;
            }else {
                result[0] = result[1] = -1;
            }
        }

    }
}
