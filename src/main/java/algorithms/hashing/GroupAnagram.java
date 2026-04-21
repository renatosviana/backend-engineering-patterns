package algorithms.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Completed with help in 22 min
public class GroupAnagram {
    public static void main (String [] args)  {

        String [] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagram(strs));

    }

    public static List<List<String>> groupAnagram(String [] strs) {

        HashMap<String, List<String>> groupAnagram = new HashMap<>();

        for (String word: strs) {

            //Convert from String to char[]
            char[] chars = word.toCharArray();

            //Order the char[]
            Arrays.sort(chars);

            //Convert back the ordered char[] to String, which is the key
            String key = new String(chars);

            if (groupAnagram.containsKey(key)) {
                groupAnagram.get(key).add(word);
            } else {
                //Adding to a list first
                List<String> list = new ArrayList<>();
                list.add(word);
                groupAnagram.put(key,list);
            }
        }

        return new ArrayList<>(groupAnagram.values());
    }
}
