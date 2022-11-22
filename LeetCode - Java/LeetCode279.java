
class Solution {
    public int numSquares(int n) {
        
        
        int[] nums = new int[n + 1];
        
        Arrays.fill(nums, n);
        
        nums[0] = 0;
        for (int i = 1; i <= n; i++) {
            
            int sqrt = (int) Math.sqrt(i);
            
            for (int j = 1; j <= sqrt; j++) {
                
                int pow = (int) Math.pow(j, 2);
                
                
                if (pow <= i) {
                    nums[i] = Math.min(nums[i], nums[i - pow] + 1);
                }
            }
        }
        return nums[n];
    }
}
