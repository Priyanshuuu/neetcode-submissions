class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int l = 0;
        for (int r = 0; r < n; r++) {
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[r]){
                dq.pollLast();
            }
            dq.offerLast(r);

            if( r - l >= k) l++;
            if(dq.peekFirst() < l){
                dq.pollFirst();
            }

            if ( r >= k - 1) {
                ans[r - k + 1] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}
