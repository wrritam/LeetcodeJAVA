
import java.util.Arrays;

public class lc885 {


        public int numRescueBoats(int[] people, int limit) {

            Arrays.sort(people);
            int ans = 0;
            int numberOfPeople = people.length;
            int s = 0;
            int e = numberOfPeople-1;


            while (s < e) {
                if (people[s] + people[e] > limit) {
                    e--;
                } else {
                    s++;
                    e--;
                }
                ans++;
            }

            if (s == e) ans++;
            return ans;
        }


}
