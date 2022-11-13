
class Solution {
    public String reverseWords(String s) {
        
            String[] strings = s.trim().replaceAll("\\s+", " ").split(" ");
            StringBuilder builder = new StringBuilder();
            
            for (int i = strings.length - 1; i >= 0; i--) {
                builder.append(" " + strings[i]);
            }
            return builder.substring(1);
        }
}
