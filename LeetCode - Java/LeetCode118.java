
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascalTriangle = new ArrayList();
        
        if(numRows==0) return pascalTriangle;
        
        for(int i=0; i<numRows; i++)
        {
            List<Integer> listAtI = new ArrayList();
            
            listAtI.add(1);
            
            for(int j=0; j<i-1; j++)
            {
                listAtI.add(pascalTriangle.get(i-1).get(j)+pascalTriangle.get(i-1).get(j+1));
            }
            
            if(i!=0) listAtI.add(1);
            pascalTriangle.add(listAtI);
        }
        return pascalTriangle;
    }
}
