
class Solution {
    public String orderlyQueue(String s, int k) {
        
            if (k == 1) {
                String string = s;
                
                for (int i = 0; i < s.length(); ++i) {
                    String temp = s.substring(i) + s.substring(0, i);
                    if (temp.compareTo(string) < 0) {
                        string = temp;
                    }
                }
                
                return string;
                
            } else {
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                
                return new String(chars);
            }
        }
}
