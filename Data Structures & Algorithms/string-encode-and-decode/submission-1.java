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
        StringBuilder temp = new StringBuilder();
        int l = s.length();
        int i = 0;
        while (i < l) {
            if (s.charAt(i) == '#') {
                int count = Integer.parseInt(temp.toString());
                temp.setLength(0);
                ans.add(s.substring(i+1, i + 1 + count));
                i += count + 1;
            } else {
                temp.append(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}
