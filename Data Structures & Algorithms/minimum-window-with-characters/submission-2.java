class Solution {
    private int getIndex(char c) {
        if (c >= 'A' && c <= 'Z')
            return c - 'A';
        return c - 'a' + 26;
    }

    public boolean isSubset52(int[] h1, int[] h2) {
        for (int i = 0; i < 52; i++) {
            if (h1[i] > h2[i]) {
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int[] h1 = new int[52];
        int[] h2 = new int[52];

        for (char c : t.toCharArray()) {
            h1[getIndex(c)]++;
        }

        int l = 0;
        String minAns = "";
        int minLen = Integer.MAX_VALUE;
        int len = s.length();
        int start = 0;

        for (int r = 0; r < len; r++) {
            h2[getIndex(s.charAt(r))]++;

            while (isSubset52(h1, h2)) {
                if (r - l + 1 < minLen) {
                    // minAns = s.substring(l, r + 1);
                    minLen = r - l + 1;
                    start = l;
                }
                h2[getIndex(s.charAt(l))]--;
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
