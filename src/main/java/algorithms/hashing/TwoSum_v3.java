package algorithms.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 Pattern: HashMap lookup

 Idea:
 For each number a, compute complement = target - a.
 If complement was seen earlier, we found the pair.

 Strategy:
 Store previously visited numbers in a map:
 number → index

 Time: O(n)
 Space: O(n)
 */

public class TwoSum_v3 {

    public static void main(String [] args) {

        int [] nums = {2,7,11,14,18};

        int target = 32;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Index of complement => "+map.get(complement)+" Index of i => "+i);
                return;
            }
            map.put(nums[i],i);
        }


    }

}
