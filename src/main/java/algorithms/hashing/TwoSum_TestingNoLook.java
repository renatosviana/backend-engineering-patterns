package algorithms.hashing;

import java.util.Arrays;
import java.util.HashMap;

//10 min 07 seg, some help
public class TwoSum_TestingNoLook {
    public static void main(String [] args) {
        int [] nums = {2,7,11,15};

        int target = 26;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int [] nums, int target) {

        HashMap<Integer, Integer> seen = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int [] {seen.get(complement), i};
            }

            seen.put(nums[i],i);


        }

        return new int [] {};

    }
}
