/*
Problem : 
Given a 2D board and a word, find if the word exists in the grid.
The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:
board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.

*/

/*
Analysis ::
Time Complexity :: O(n)
Space Complexity :: O(n)
*/

class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wordChar = word.toCharArray();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(backtracking(board, i, j, wordChar, 0))
                    return true;
            }
        }
        return false;
    }
    
    private boolean backtracking(char[][] board, int i, int j, char[] word, int index){
        if(index == word.length)
            return true;
        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1 || board[i][j] != word[index])
            return false;
        
        board[i][j] = '*';
        boolean result = backtracking(board, i-1, j, word, index+1)
            || backtracking(board, i+1, j, word, index+1)
            || backtracking(board, i, j-1, word, index+1)
            || backtracking(board, i, j+1, word, index+1);
        board[i][j] = word[index];
        return result;
    }
}