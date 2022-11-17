
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int area1 = Math.abs((ax2 - ax1) * (ay2 - ay1));
        int area2 = Math.abs((bx2 - bx1) * (by2 - by1));
        
        boolean ifIntersect = Math.max(ax1, bx1) < Math.min(bx2, ax2) && Math.max(ay1, by1) < Math.min(ay2, by2);
        
        int overlap = Math.abs((Math.min(bx2, ax2) - Math.max(ax1, bx1)) * (Math.min(ay2, by2) - Math.max(ay1, by1)));

        return area1 + area2 - ((area1 != 0 && area2 != 0 && ifIntersect) ? overlap : 0);

    }
}
