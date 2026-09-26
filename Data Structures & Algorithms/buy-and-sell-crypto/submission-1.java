class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int max = prices[prices.length-1];
        for(int i = prices.length-2; i >= 0; i--){
            if(prices[i] > max){
                max = prices[i];
            } else {
                ans = Math.max(ans, max - prices[i]);
            }
        }
        return ans;
    }
}
