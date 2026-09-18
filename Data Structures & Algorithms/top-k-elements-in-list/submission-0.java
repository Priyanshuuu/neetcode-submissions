class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i: nums){
            mp.merge(i, 1, Integer::sum);
        }

        int[][] arr = new int[mp.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            arr[index][0] = entry.getValue(); // Column 0: value
            arr[index][1] = entry.getKey();   // Column 1: key
            index++;
        }

        // 2. Sort 2D array by index 0 (value) ascending
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));
        int[] ans = new int[k];
        
        for (int i = 0; i < k; i++) ans[i] = arr[i][1];

        return ans;
    }
}
