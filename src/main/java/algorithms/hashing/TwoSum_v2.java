package algorithms.hashing;

import java.util.HashMap;
import java.util.Map;
/**
Pattern: HashMap lookup

Idea:
For each number a, the number we need is (target - a).
If we already saw that number earlier, we found the pair.

Strategy:
Store numbers we already visited in a HashMap
key = number
value = index


While iterating the array:
1. Compute complement = target - nums[i]
2. Check if complement already exists in the map
3. If yes, solution found
4. Otherwise store current number in map

Time complexity: O(n)
Space complexity: O(n)
 */

public class TwoSum_v2 {

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
