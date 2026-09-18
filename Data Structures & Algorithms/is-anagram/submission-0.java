class Solution {
    public boolean isAnagram(String s, String t) {
        int[] al = new int[26];
        for(char c : s.toCharArray()) al[c-97]++;
        for(char c : t.toCharArray()) al[c-97]--;

        for (int i : al) if(i != 0) return false;
        return true;
    }
}
