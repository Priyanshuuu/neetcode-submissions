class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0, temp = 1, tempK = k, i = 0, j = 0;
        while(j < s.length()){
            while(j < s.length() - 1 && s.charAt(j) == s.charAt(j+1)){
                j++;
                temp++;
            }
            i = j + 1;
            while(i < s.length() && (s.charAt(j) == s.charAt(i) || tempK != 0)){
                if (s.charAt(j) != s.charAt(i)){
                    tempK--;
                } 
                temp++;
                i++;
            }
            if (tempK != 0){
                temp = Math.min(temp + tempK, s.length());
            }
            ans = Math.max(ans, temp);
            temp = 1;
            tempK = k;
            j++;
        }
        return ans;
    }
}
