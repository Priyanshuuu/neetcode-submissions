class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int val = board[i][j] - '1';
                    int mask = 1 << val; // Bit position for the number
                    int box = (i / 3) * 3 + (j / 3);

                    // If bit is already set in any mask, duplicate found
                    if ((rows[i] & mask) != 0 || (cols[j] & mask) != 0 || (boxes[box] & mask) != 0) {
                        return false;
                    }

                    // Set the bit
                    rows[i] |= mask;
                    cols[j] |= mask;
                    boxes[box] |= mask;
                }
            }
        }
        return true;
    }
}