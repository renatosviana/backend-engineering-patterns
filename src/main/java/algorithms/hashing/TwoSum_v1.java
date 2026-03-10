package algorithms.hashing;

import java.util.Map;
import java.util.HashMap;

public class TwoSum_v1 {

    //giving an array, sum two number and if result equals to target, return both indexes
    public static void main(String [] args) {

        int [] nums = {2,7,11,14,18};

        int target = 32;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++) {
            //a+b = target => b = target - a => a == nums[i] and b is the complement
            //I need to check if complement is in the array, if it's I'll return i which is the index of nums[i]
            //and also I need to return the index of complement
            // I will store the complement value and its index in order to retrieve once condition is satified.
            // I can only store after the condition because first time it will be empty
            // AC: Example: target = 9
            //     9-2 = 7, is 7 in the array? If not store 2 i.e. nums[i] and it's position and move to next one. Thus, I'll
            // need a HashMap to store the two Integer values. If it is present, this value plus complement is equal to
            //target by convetion so no need to do the math, only return the indexes.
            int complement = target - nums[i];
            //00:14:05 -- remembering which method to use
            //map for the lookup (O(1))
            if (map.containsKey(complement)) {
                System.out.println("Index of complement => "+map.get(complement)+" Index of i => "+i);
                return;
            }
            map.put(nums[i],i);
        }


    }

}
