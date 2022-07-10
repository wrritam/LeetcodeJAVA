
class Solution {
    public int[] runningSum(int[] nums) {
        
        int x = nums.length;
        int[] ans = new int[x];
        int y=0;
        for(int i=0; i<x; i++){
            y+=nums[i];
            ans[i]=y;
        }
        return ans;
    }
}
