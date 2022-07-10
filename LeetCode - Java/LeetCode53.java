
class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<nums.length;i++)
        {
            cursum=cursum+nums[i];
            if(cursum>maxsum)
                maxsum=cursum;
            if(cursum<0)
                cursum=0;
        }
        return maxsum;        
        
    }
}
