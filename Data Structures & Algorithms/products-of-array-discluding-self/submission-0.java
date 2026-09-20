class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] pre = new int[l];
        int[] suf = new int[l];
        int[] ans = new int[l];
        for(int i = 0; i < l ; i++) {
            if (i == 0) pre[i] = nums[i];
            else pre[i] = pre[i-1]*nums[i]; 
        }
        for(int i = l-1; i >= 0 ; i--) {
            if (i == l-1) suf[i] = nums[i];
            else suf[i] = suf[i+1]*nums[i]; 
        }
        for (int i = 0; i < l ; i++) {
            if(i == 0){
                ans[i] = suf[i+1];
            } else if(i == l-1){
                ans[i] = pre[i-1];
            } else {
                ans[i] = pre[i-1]*suf[i+1];
            }
        }
        return ans;
    }
}  
