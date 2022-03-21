public class LeetCode34 {

    public static  void main(String[] args) {

        int [] numbs = {2, 3, 7, 7, 7, 7, 8, 9, 6};
        int target = 7;

        int[] answer = searchRange(numbs, target);
        System.out.println(answer);

    }
    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        int first = search(nums, target, true);
        int last = search(nums, target, false);

        ans[0]=first;
        ans[1]=last;

        return ans;

    }

    // target

    static int search(int[] nums, int target, boolean firstindex){

        int start = 0;
        int end = nums.length-1;

        int ans = -1;

        while(start<=end){

            int mid = start+(end-start)/2;

            if (target<nums[mid]){
                end = mid-1;
            }else if (target>nums[mid]){
                start=mid+1;
            }else{

                ans = mid;
                if (firstindex==true){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

}
