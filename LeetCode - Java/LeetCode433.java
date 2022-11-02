

class Solution {
    int minMutation=Integer.MAX_VALUE;

        public int minMutation(String start, String end, String[] bank) {
            
            if(bank.length==0) return -1;
            func(start,end,bank,0,new HashSet<>());
            return minMutation==Integer.MAX_VALUE?-1:minMutation;
        }
        public void func(String start, String end, String[] bank, int count, Set<String> set){

            if(start.equals(end)){
                minMutation=Math.min(minMutation,count);
                return;
            }
            
            for(int i=0;i<bank.length;i++){
                if(count(start,bank[i])==1 && !set.contains(bank[i])){
                    set.add(bank[i]);
                    func(bank[i],end,bank,count+1,set);
                    set.remove(bank[i]);
                }
            }
            
        }
        public int count(String a, String b){
            
            int count=0;
            for(int i=0;i<8;i++){
                if(a.charAt(i)!=b.charAt(i)) count++;
            }
            return count;
        }
}
