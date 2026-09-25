class Solution {
    public int maxArea(int[] h) {
        int ans = 0;
        int i = 0;
        int j = h.length - 1;

        while(i<j){
            ans = Math.max(ans, Math.min(h[i], h[j])*(j - i));
            if(h[i] > h[j]) j--;
            else i++;
        }
        return ans;
    }
}
