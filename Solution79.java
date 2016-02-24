import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alex on 2016/2/24.
 */
public class Solution79 {
    public boolean exist(char[][] board, String word) {
        char[] word_char = word.toCharArray();
        Boolean result=false;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == word_char[0]){
                    System.out.println(i+" "+j);
                    Set<String> hasUsed = new HashSet<>();
                    hasUsed.add(i+" "+j);
                    result = search(board, word_char, i, j, 0, result, hasUsed);
                    if(result){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board, char[] word, int x, int y, int index, Boolean result, Set hasUsed){
        System.out.println(x+" "+y);
        if(index == word.length-1){
            return true;
        }else{
            boolean up = false;
            boolean down = false;
            boolean left = false;
            boolean right = false;
            if(y+1 < board[x].length && board[x][y+1] == word[index+1] && !hasUsed.contains(x+" "+(y+1))){
                hasUsed.add(x+" "+(y+1));
                up =  search(board, word, x, y + 1, index + 1, result, hasUsed);
            }
            if(y-1 >= 0 && board[x][y-1] == word[index+1] && !hasUsed.contains(x+" "+(y-1))){
                hasUsed.add(x+" "+(y-1));
                down = search(board, word, x, y-1, index+1, result, hasUsed);
            }
            if(x+1 < board.length && board[x+1][y] == word[index+1] && !hasUsed.contains((x+1)+" "+y)){
                hasUsed.add((x+1)+" "+y);
                right = search(board, word, x+1, y, index+1, result, hasUsed);
            }
            if(x-1 >= 0 && board[x-1][y] == word[index+1] && !hasUsed.contains((x-1)+" "+y)){
                hasUsed.add((x-1)+" "+y);
                left = search(board, word, x-1, y, index+1, result, hasUsed);
            }
            if(!(up || down || right || left)){
             hasUsed.remove(x+" "+y);
            }
            return up || down || right || left;
        }
    }
}
