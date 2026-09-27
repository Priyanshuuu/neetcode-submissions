class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int n = s.length();
        int ans = 0, l = 0;
        for (int r = 0; r < n; r++) {
            if (mp.containsKey(s.charAt(r)) && mp.get(s.charAt(r)) >= l) {
                ans = Math.max(ans, r - l);
                l = mp.get(s.charAt(r)) + 1;
            }
            mp.put(s.charAt(r), r);
        }
        if (mp.size() == n)
            return n;
        ans = Math.max(ans, n - l);
        return ans;
    }
}
