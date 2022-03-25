class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int lastOne = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != lastOne) {
                nums[index++] = nums[i];
                lastOne = nums[i];
            }
        }

        return index;
    }
}
