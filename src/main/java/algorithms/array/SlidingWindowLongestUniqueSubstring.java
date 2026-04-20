package algorithms.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SlidingWindowLongestUniqueSubstring {
    public static void main (String [] args) {
        String s = "abcabcabcddabcdeff";

        Result r = longestSubstring(s);
        System.out.println(r.length()+" "+r.substring());
    }

    //returns the size and the string itself
    public static Result longestSubstring(String s){

//        Set<Character> window = new HashSet();
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        int maxLeft = 0;
        int maxRight = 0;

        //if c = d and abcd, doesnt' remove a, but d directly
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1); // jump directly
            }
            map.put(c, right);


//        for (int right = 0; right < s.length(); right++) {
//            char c = s.charAt(right);
//
//            while(window.contains(c)) {
//                window.remove(s.charAt(left));
//                left++;
//            }

//            window.add(c);

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                maxLeft = left;
                maxRight = right;
            }

//            maxLength = Math.max(maxLength, right - left + 1);
        }

        return new Result(maxLength,s.substring(maxLeft, maxRight + 1));
//        return maxLength + " " +s.substring(maxLeft, maxRight + 1);
//        return maxLength;

    }
}

