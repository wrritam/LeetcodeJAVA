
import java.util.HashSet;
import java.util.Set;

public class lc523 {

    public boolean checkSubarraySum(int[] nums, int k) {
        k = k == 0 ? Integer.MAX_VALUE : Math.abs(k); // set k to positive for moding usage

        int length = nums.length;

        if (length / 2 > k) return true; // Pigeonhole principle

        Set<Integer> set = new HashSet<>();
        int EndModifying = 0;

        for (int num : nums) {
            int mod = (EndModifying + num) % k;
            if (((HashSet<?>) set).contains(mod)) return true;
            set.add(EndModifying);
            EndModifying = mod;
        }

        return false;
    }
}
