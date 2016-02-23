/**
 * Created by alex on 16-2-22.
 */
public class Test {
    public static void main(String[] arg) {
        Solution35 solution35 = new Solution35();
        //[1,3,5,6], 5 → 2
        //[1,3,5,6], 2 → 1
        //[1,3,5,6], 7 → 4
        //[1,3,5,6], 0 → 0
        int[] nums = {1};
        System.out.println(solution35.searchInsert(nums, 1));
    }
}
