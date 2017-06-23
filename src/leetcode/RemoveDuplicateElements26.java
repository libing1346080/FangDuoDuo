package leetcode;

/**
 * Created by fdd on 2017/6/22.
 */
public class RemoveDuplicateElements26 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicate(nums));
        Integer a = 10;
        long testlong = a;
    }
    public static int removeDuplicate(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int count = 1;
        int cur = 0, next  = 1;
        while(next < nums.length){
            if(nums[cur] == nums[next]){
                next++;
            }else{
                count++;
                nums[++cur] = nums[next];
                next++;
            }
        }
        return count;
    }
}
