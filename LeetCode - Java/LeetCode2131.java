
class Solution {
    public int longestPalindrome(String[] words) {
        
            HashMap<String,Integer> set = new HashMap<String,Integer>();
            
            int i;
            int alphabets= words.length;
            int ans=0;
            int count;
            
            for(String word: words){
                
                char ch=word.charAt(0),b=word.charAt(1);
                if(set.getOrDefault(b+""+ch,0)>0){
                    ans+=4;
                    count=set.get(b+""+ch)-1;
                    set.put(b+""+ch,count);
                }else {
                    
                    count=set.getOrDefault(word,0);
                    set.put(word,count+1);
                }
            }
            
            for(String word: words)
                if(set.getOrDefault(word,0)>0 && word.charAt(0)==word.charAt(1)){
                    ans+=2;
                    break;
                }
            return ans;
        }
}
