package algorithms.twopointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

//28.April.2026 -- 6:14am - 7:34am
//29.April.2026 -- Done in LeetCode directly and failed with edge cases
//30.April.2026 -- 6:37am - 8:33am add duplicate handling and edge cases for 3Sum; fix flipped sum comparison
//TODO: skip duplicate left/right values after recording a triplet to avoid adding the same triplet multiple times on inputs
public class ThreeSum {

    public static void main(String [] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));  // happy path
        System.out.println(threeSum(new int[]{0,0,0,0}));         // duplicates
        System.out.println(threeSum(new int[]{0,0,0}));           // minimum case
        System.out.println(threeSum(new int[]{1,2,3}));           // no solution
        System.out.println(threeSum(new int[]{}));                // empty
    }

    public static List<List<Integer>> threeSum(int [] nums) {

        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0;i<nums.length;i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;


            int left = i+1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return triplets;
    }

}
