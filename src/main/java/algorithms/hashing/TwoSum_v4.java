package algorithms.hashing;

import java.util.Map;
import java.util.HashMap;

/**
 * Idea:
 * Given an array sum two numbers that if equal to target, return respective indexes
 *
 * Strategy:
 * Check if the complement i.e. complement = target - nums[i], has been seen before
 *
 * Time complexity: O(n)
 * Space complexity:
 */


public class TwoSum_v4 {


    public static void main(String [] args) {
        int [] nums = {2,17, 20, 45};

        int target = 37;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < nums.length; i++)  {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println("Index of complement => "+map.get(complement)+" index of i =>"+i);
                //this only was missing
                return;
            }

            map.put(nums[i],i);

        }

    }

}
