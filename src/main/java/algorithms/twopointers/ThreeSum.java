package algorithms.twopointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// Two Sum - HashMap version (unsorted):    x + y = target (x = target - y, I have seen target - y before? for each y)
// 3Sum    - Two-pointer version (sorted):  x + y + z = 0  →  y + z = -x   (Two Sum with target = -x; target 0 is implicit)
//                                          where x = nums[i] is the fixed anchor,
//                                          y = nums[left], z = nums[right]
//                                          start left/right at the ends, then move them toward each other
//                                          no memory needed; sorting gives direction
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
            if (i > 0 && nums[i] == nums[i-1])
               continue;

            int left = i+1;
            int right = nums.length - 1;

            //basically here it says that left pointer cannot be greater than right, because then it will be out of bond
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left-1]) left++;
                    while (left < right && nums[right] == nums[right+1]) right--;
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
