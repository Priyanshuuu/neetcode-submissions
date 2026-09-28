class Solution {
    public int characterReplacement(String s, int k) {
        int maxf = 0, maxl = 0, l = 0;
        int len = s.length();
        int[] freq = new int[26];

        for(int r = 0; r < len; r++){
            freq[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf, freq[s.charAt(r) - 'A']);

            while(r - l + 1 - maxf > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            maxl = Math.max(maxl, r - l + 1);
        }
        
        return maxl;
    }
}
