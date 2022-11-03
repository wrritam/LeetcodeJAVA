
class Solution {
   
        public double findMedianSortedArrays(int nums1[], int nums2[]) {
            int lenth1 = nums1.length;
            int lenth2 = nums2.length;
            
            if (lenth1 > lenth2) {
                return findMedianSortedArrays(nums2, nums1);
            }

            int lowFOR1 = 0;
            int highFOR1 = lenth1;
            
            while (lowFOR1 <= highFOR1) {
                
                int Partition1 = (lowFOR1 + highFOR1)/2;
                int Partition2 = (lenth1 + lenth2 + 1)/2 - Partition1;

                int leftMax1 = (Partition1 == 0) ? Integer.MIN_VALUE : nums1[Partition1 - 1];
                int rightMax1 = (Partition1 == lenth1) ? Integer.MAX_VALUE : nums1[Partition1];

                int leftMax2 = (Partition2 == 0) ? Integer.MIN_VALUE : nums2[Partition2 - 1];
                int rightMax2 = (Partition2 == lenth2) ? Integer.MAX_VALUE : nums2[Partition2];

                
                if (leftMax1 <= rightMax2 && leftMax2 <= rightMax1) {
                    
                    if ((lenth1 + lenth2) % 2 == 0) {           
                        return ((double)Math.max(leftMax1, leftMax2) + Math.min(rightMax1, rightMax2))/2;
                    } else {                                        
                        return (double)Math.max(leftMax1, leftMax2);
                    }
                } else if (leftMax1 > rightMax2) {          
                    highFOR1 = Partition1 - 1;                
                } else {                                            
                    lowFOR1 = Partition1 + 1;                  
                }
                
            }
            throw new IllegalArgumentException();
        }
    
}
