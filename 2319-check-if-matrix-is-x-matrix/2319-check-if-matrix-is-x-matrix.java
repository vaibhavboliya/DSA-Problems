class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int r =0;r<grid.length;r++)
            for(int c = 0;c<grid[0].length;c++){
                if(r==c || r == grid.length-c-1){
                    if(grid[r][c]==0)
                        return false;
                }
                else{
                    if(grid[r][c]!=0)
                        return false;
                }
            }
        return true;
    }
}