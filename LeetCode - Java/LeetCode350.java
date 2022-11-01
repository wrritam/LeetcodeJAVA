
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lc350 {

    
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int k = 0;
            for (int i = 0; i < nums1.length; i++) {
                map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
            }
            for (int i = 0; i < nums2.length; i++) {
                if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                    nums1[k] = nums2[i];
                    k++;
                }
                map.put(nums2[i], map.getOrDefault(nums2[i], 0)-1);
            }
            return Arrays.copyOfRange(nums1, 0, k);
        }

}
