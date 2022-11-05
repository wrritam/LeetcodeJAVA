
class Solution{
public static String reverseVowels(String s) {

        if (s.isEmpty()) {
            return "";
        }

        List<Character> vowels = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowels.add(c);
                pos.add(i);
            }
        }

        for (int i = 0; i < (vowels.size() + 1) / 2; i++) {
            char t = vowels.get(i);
            vowels.set(i, vowels.get(vowels.size() - i - 1));
            vowels.set(vowels.size() - i - 1, t);
        }

        StringBuilder stvar = new StringBuilder();

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (j < pos.size() && pos.get(j) == i) {
                stvar.append(vowels.get(j++));
            } else {
                stvar.append(s.charAt(i));
            }
        }
        return stvar.toString();
    }
}
