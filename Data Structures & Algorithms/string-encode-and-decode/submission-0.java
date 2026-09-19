class Solution {
    public String encode(List<String> strs) {
        String ans = "";
        String deli = "🚀";
        for (String s : strs) {
            ans += s + deli;
        }
        return ans;
    }

    public List<String> decode(String s) {
        String deli = "🚀";
        List<String> ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        int l = s.length();
        int i = 0 ;
        while (i <l) {
            if (s.startsWith(deli, i)) {
                ans.add(temp.toString());
                temp.setLength(0);
                i += deli.length();
            } else {
                temp.append(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}
