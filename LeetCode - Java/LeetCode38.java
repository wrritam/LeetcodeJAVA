
public class leetcode38 {


    public static String countAndSay(int n) {
        String random = "1";
        for (int i = 1; i < n; i++) {

            StringBuilder builder = new StringBuilder();

            for (int j = 1, count = 1; j <= random.length(); j++) {
                if (j == random.length() || random.charAt(j - 1) != random.charAt(j)) {
                    builder.append(count);

                    builder.append(random.charAt(j - 1));
                    count = 1;
                } else {
                    count++;
                }
            }
            random = builder.toString();
        }
        return random;
    }
}
