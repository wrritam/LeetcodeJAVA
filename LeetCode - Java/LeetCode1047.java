class Solution{
  
      public String removeDuplicates(String s) {
            StringBuilder builder = new StringBuilder();
            for (char ch : s.toCharArray()) {
                
                if (builder.length() > 0 && builder.charAt(builder.length() - 1) == ch) builder.deleteCharAt(builder.length() - 1);
                else builder.append(ch);
            }
            return builder.toString();
        }
}
