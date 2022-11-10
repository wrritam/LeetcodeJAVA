
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
            Map<Integer, Integer> map = new HashMap<>();
            
            for (int i=0; i<nums1.length; i++) {
                
                for (int j=0; j<nums2.length; j++) {
                    map.put(nums1[i] + nums2[j], map.getOrDefault(nums1[i] + nums2[j], 0) + 1);
                }
            }

            int tuples = 0;

            for (int i=0; i<nums3.length; i++) {
                
                for (int j=0; j<nums4.length; j++) {
                    tuples += map.getOrDefault(-1 * (nums3[i] + nums4[j]), 0);
                }
            }

            return tuples;
        }
}
