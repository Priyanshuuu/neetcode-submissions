class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        // Set<Character> st = new HashSet<>();
        int n = s.length();
        if (n < 2)
            return n;
        int ans = 0;
        int temp = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(s.charAt(i)) && mp.get(s.charAt(i)) >= j) {
                ans = Math.max(ans, i-j);
                j = mp.get(s.charAt(i)) + 1;
            }
            // st.add(s.charAt(i));
            mp.put(s.charAt(i), i);
        }
        // System.out.println(ans);
        if (mp.size() == n)
            return n;
        ans = Math.max(ans, n - j);
        return ans;
    }
}
