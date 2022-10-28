
import java.util.*;

public class leetcode49 {

     public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return null;
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            String existingMap = count(word);
            map.computeIfAbsent(existingMap, x -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public String count(String str) {
        int[] alphabets = new int[26];
        for (char c : str.toCharArray()) {
            alphabets[c - 'a']++;
        }
        return Arrays.toString(alphabets);
    }
}
