
import java.util.List;

public class lc1018 {
  
        public List<Boolean> prefixesDivBy5(int[] nums) {

            int numsLength = nums.length;

            List<Boolean> booleanList = new ArrayList<>();
            int rem = 0;

            if (nums[0] == 0) {
                booleanList.add(true);
            } else {
                booleanList.add(false);
                rem = 1;
            }

            for (int i = 1; i < numsLength; i++) {
                rem = ((rem << 1) + nums[i]) % 5;
                if (rem == 0) {
                    booleanList.add(true);
                } else {
                    booleanList.add(false);
                }
            }

            return booleanList;
        }

}
