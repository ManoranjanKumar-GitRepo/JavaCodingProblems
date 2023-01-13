package Top.MEDIUM.Coding_Questions;

public class SearchWord {
	
	public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(helper(board, i, j, 0, word)){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean helper(char[][] grid, int i, int j, int index, String word ){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '.' || grid[i][j] != word.charAt(index)){
            return false;            
        }
        
        if(index == word.length()-1){
            return true;
        }
        
        char c = grid[i][j];
        boolean result = false;
        grid[i][j] = '.';
        
        result = helper(grid, i+1, j, index+1, word) || helper(grid, i-1, j, index+1, word) || 
                    helper(grid, i, j+1, index+1, word) || helper(grid, i, j-1, index+1, word);

        grid[i][j] = c;
        
        return result;
    }

}
