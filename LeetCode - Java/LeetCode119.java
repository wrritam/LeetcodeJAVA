
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
           if(rowIndex==0)
               return a;
       int j=0;
        while(j<rowIndex){
              if(j==rowIndex){
                  break;
              }
            else
                a = helper(a);
            j++;
        }
      return a;
     
    }
    List<Integer> helper(List<Integer> a){
        List<Integer> c = new ArrayList<Integer>();
        for(int i=0;i<a.size();i++){
                if(i==0)
                    c.add(1);
                else
                    c.add(a.get(i)+a.get(i-1));
            }
            c.add(1);
        return c;
    }
}
