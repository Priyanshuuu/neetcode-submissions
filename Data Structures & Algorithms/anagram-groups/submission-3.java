class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        int[] al = new int[26];

        for (String s : strs) {
            int n = s.length();
            for (int i = 0; i<n; i++) {
                al[s.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(al);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
            
            Arrays.fill(al,0);
        }

        return new ArrayList<>(map.values());
    }
}
