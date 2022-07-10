class Solution {
    public String addBinary(String a, String b) {
        StringBuilder strng = new StringBuilder();
        
        int num1 = a.length()-1;
        int num2 = b.length()-1;
        int carry = 0;
        
        while(num1>=0 || num2>=0){
            
            
            int total = carry;
            
             if(num1>=0) total+= a.charAt(num1)- '0';
            if(num2>=0) total+= b.charAt(num2)- '0';
            
            
            strng.append(total%2);
            
            carry = total/2;
            
            
            num1--;
            num2--;
        }
        
        if(carry != 0) strng.append(carry);
        return strng.reverse().toString();
    }
}
