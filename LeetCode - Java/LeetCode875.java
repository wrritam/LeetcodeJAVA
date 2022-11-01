
public class lc875 {
    
    public int minEatingSpeed(int[] piles, int H) {
        int low = 1;
        int high = Integer.MAX_VALUE - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            int hours = consumedTime(piles, mid);
            if (hours <= H) high = mid;
            else low = mid + 1;
        }

        return low;
    }

    private int consumedTime(int[] piles, int K) {
        int hours = 0;

        for (int i=0; i<piles.length; i++) {
            hours += piles[i] / K + (piles[i] % K == 0 ? 0 : 1);
        }

        return hours;
    }
}
