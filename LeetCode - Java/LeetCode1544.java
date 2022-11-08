
public class lc1544 {

     public String makeGood(String s) {

            for (int i = 0; i < s.length() - 1; ++i) {
                if (Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32)
                    return makeGood(s.substring(0, i) + s.substring(i + 2));
            }

            return s;
        }

}
