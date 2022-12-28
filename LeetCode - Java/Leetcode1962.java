
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
     for(int i=0;i<capacity.length;i++)
        {
            capacity[i]-=rocks[i];
        }
        Arrays.sort(capacity);
        
        int count = 0;
        for(int i=0;i<capacity.length;i++)
        {
            if(additionalRocks-capacity[i]>=0)
            {
                additionalRocks-=capacity[i];
                
                count++;
            } else {
                
                break;
            }
        }
        return count;   
    }
}
