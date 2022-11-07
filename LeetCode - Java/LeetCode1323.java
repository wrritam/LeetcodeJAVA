
class Solution {
    public int maximum69Number (int num) {
        
        String str = String.valueOf(num);
        int position = str.length() - (str.indexOf("6")+1);
        return position == str.length()? num: num + (int) (3* Math.pow(10, position));
        
    }
}
