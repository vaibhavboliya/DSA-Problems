class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int r = 0;r<n;r++){
            Set<Integer> row = new HashSet<>();
            Set<Integer> column = new HashSet<>();
            for(int c = 0;c<matrix[0].length;c++){
                if(!row.add(matrix[c][r]) || !column.add(matrix[r][c]))
                    return false;
            }
        }
        return true;
        
    }
}