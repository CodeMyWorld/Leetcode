/**
 * Created by alex on 16-2-22.
 */
public class Test {
    public static void main(String[] arg) {
        char[][] board = {{'A','B','C','E'},
                          {'S','F','E','S'},
                          {'A','D','E','E'}};
        Solution79 solution79 = new Solution79();
        System.out.println(solution79.exist(board, "ABCESEEEFS"));
    }
}
