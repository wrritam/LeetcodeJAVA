
class Solution {
   public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int length = haystack.length();
        if(needleLength==0){
            return 0;
        }
        if(length==0){
            return -1;
        }
        int first;
        int last = needleLength;

        for(first = 0 ;first<length;first++){
            if(last > length){
                return -1;
            }
            if(haystack.substring(first,last).equals(needle))
                return first;
            last++;
        }

        return -1;
    }
}
