class Solution {
    public long gridGame(int[][] grid) {
        long row1 = 0;
        for(int i = 0 ; i<grid[0].length ; i++){
            row1+= grid[0][i];
        }
        long row2 = 0 ;
        long res = Long.MAX_VALUE;
        for(int i = 0 ; i<grid[0].length ; i++){
            row1-=grid[0][i];
            res = Math.min(res,Math.max(row1,row2));
            row2+=grid[1][i];
        }
        return res;
    }
}
