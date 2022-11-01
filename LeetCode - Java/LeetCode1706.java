
public class lc1706 {

    
        int rows, columns;

        public int[] findBall(int[][] grid) {

            rows = grid.length;
            columns = grid[0].length;

            int[] result = new int[columns];
            for (int i = 0; i < columns; i++) {
                result[i] = func(i, grid);
            }

            return result;
        }

        public int func(int x, int[][] grid) {

            int r = 0;
            int c = x;

            while (r < rows) {
                int cxt = c + grid[r][c];
                if (cxt < 0 || cxt > columns - 1 || grid[r][c] != grid[r][cxt]) {
                    return -1;
                }

                r++;
                c = cxt;
            }
            return c;
        }

}
