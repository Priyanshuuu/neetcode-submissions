class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<Integer, Set<Character>> col = new HashMap<>();
        Map<Integer, Set<Character>> box = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val != '.') {
                    if (!row.computeIfAbsent(i, k -> new HashSet<>()).add(val)) {
                        // System.out.println("row");
                        return false;
                    }
                    if (!col.computeIfAbsent(j, k -> new HashSet<>()).add(val)) {
                        // System.out.println("col");
                        return false;
                    }
                    int bKey = (i / 3) * 3 + (j / 3);
                    if (!box.computeIfAbsent(bKey, k -> new HashSet<>()).add(val)) {
                        // System.out.printf("box: %d, val: %c, row: %d, col: %d%n", bKey, val, i, j);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
