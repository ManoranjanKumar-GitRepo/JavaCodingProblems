package Top.MEDIUM.Coding_Questions;

public class NumberOfIslands {
	
	public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int row = grid.length;
        int col = grid[0].length;
        int result = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    private void dfs(char[][] grid, int row, int col){
        int rowNum = grid.length;
        int colNum = grid[0].length;

        if(row < 0 || row >= rowNum || col < 0 || col >= colNum || grid[row][col] == '0'){
            return;
        }
        grid[row][col] = '0';

        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);
    }

}
