package ValidSudoku;

import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];

                if (c == '.') {
                    continue;
                }

                if (!seen.add(c + " in row " + i) || !seen.add(c + " in column " + j)
                        || !seen.add(c + " in cube" + i / 3 + "-" + j / 3)) {
                    return false;
                }
            }
        }

        return true;
    }
}
