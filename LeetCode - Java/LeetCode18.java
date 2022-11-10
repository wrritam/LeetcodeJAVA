
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc18 {
    
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            return kSum(nums, target, 0, 4);
        }

        public List<List<Integer>> kSum(int[] ints, long target, int s, int k) {

            List<List<Integer>> result = new ArrayList<>();

            if (s == ints.length) {
                return result;
            }
            long averageValue = target / k;
            if  (ints[s] > averageValue || averageValue > ints[ints.length - 1]) {
                return result;
            }

            if (k == 2) {
                return twoSum(ints, target, s);
            }

            for (int i = s; i < ints.length; ++i) {
                if (i == s || ints[i - 1] != ints[i]) {
                    for (List<Integer> subset : kSum(ints, target - ints[i], i + 1, k - 1)) {
                        result.add(new ArrayList<>(Arrays.asList(ints[i])));
                        result.get(result.size() - 1).addAll(subset);
                    }
                }
            }
            return result;
        }

        public List<List<Integer>> twoSum(int[] ints, long target, int s) {
            List<List<Integer>> result = new ArrayList<>();

            int low = s;
            int high = ints.length - 1;

            while (low < high) {
                int currSum = ints[low] + ints[high];
                
                if (currSum < target || (low > s && ints[low] == ints[low - 1])) {
                    ++low;
                } else if (currSum > target || (high < ints.length - 1 && ints[high] == ints[high + 1])) {
                    --high;
                } else {
                    result.add(Arrays.asList(ints[low++], ints[high--]));
                }

            }
            return result;
        }
        
}


//COLLECTED
