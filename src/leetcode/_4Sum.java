package leetcode;
import java.util.*;
/**
 * Created by fdd on 2017/6/19.
 */
public class _4Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(fourSum(nums, -1));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    int left = j + 1, right = nums.length - 1;
                    if (j == 1 || (j > 1 && nums[j] != nums[j - 1])) {
                        while (left < right) {
                            if (nums[i] + nums[j] + nums[left] + nums[right] == target) {
                                res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                                while (left < right && nums[left] == nums[left + 1]) left++;
                                while (left < right && nums[right] == nums[right - 1]) ;
                                left++;
                                right--;
                            }else if(nums[i] + nums[j] + nums[left] + nums[right] < target){
                                left++;
                            }else{
                                right--;
                            }

                        }
                    }
                }

            }
        }
        return res;
    }
}