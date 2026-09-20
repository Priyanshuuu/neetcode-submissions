class Solution {
    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for (String s : strs) {
            ans.append(s.length()).append("#").append(s);
        }
        return ans.toString();
    }

    public List<String> decode(String s) {
        List<String> ans = new ArrayList<>();
        int l = s.length();
        int i = 0;
        while (i < l) {
            int sIdx = s.indexOf('#', i);
            int count = Integer.parseInt(s.substring(i,sIdx));
            ans.add(s.substring(sIdx + 1, sIdx + 1 + count));
            i = sIdx + 1 + count;
        }
        return ans;
    }
}
