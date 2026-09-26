class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        if (l == 1) return 0;
        int ans = 0;
        int max = prices[l-1];

        for(int i = l-2; i >= 0; i--){
            if(prices[i] > max){
                max = prices[i];
            } else {
                ans = Math.max(ans, max - prices[i]);
            }
        }
        return ans;
    }
}
