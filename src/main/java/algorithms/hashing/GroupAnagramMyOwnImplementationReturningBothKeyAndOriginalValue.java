package algorithms.hashing;

import java.util.*;

public class GroupAnagramMyOwnImplementationReturningBothKeyAndOriginalValue {

    public static void main (String [] args) {

        String [] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagram(strs));
    }

//    public static List<List<String>> groupAnagram(String [] strs) {
    public static HashMap<String, List<String>> groupAnagram(String [] strs) {

        HashMap<String, List<String>> anagr = new HashMap<>();



        for (int i=0; i < strs.length;i++) {

            //Convert string to char[]
            char[] chars = strs[i].toCharArray();

            //Order
            Arrays.sort(chars);

            //Convert char back[] to string
            String key = new String(chars);


            if (anagr.containsKey(key)) {
                anagr.get(key).add(strs[i]); //List<String>??
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                anagr.put(key, list);
            }

        }

//        return new String [] {};
        return (HashMap<String, List<String>>) anagr;
    }

}
