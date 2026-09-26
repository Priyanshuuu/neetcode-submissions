class Solution {

    public static void pr(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    public int trap(int[] h) {
        int l = h.length;
        int ans = 0;
        int[] pre = new int[l];
        int[] suf = new int[l];
        pre[0] = h[0];
        for (int i = 1; i < l; i++){
            pre[i] = Math.max(h[i], pre[i-1]);
        }

        // pr(pre);

        suf[l-1] = h[l-1];
        for (int i = l-2; i >=0; i--){
            suf[i] = Math.max(h[i], suf[i+1]);
        }

        // pr(suf);

        for (int i = 0; i < l; i++){ 
            ans += Math.min(pre[i], suf[i]) - h[i];
        }
        return ans;
    }
}
