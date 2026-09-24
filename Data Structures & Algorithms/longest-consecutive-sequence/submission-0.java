class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int l = nums.length;
        if (l <= 1) return l;
        for (int i : nums) hs.add(i);
        int maxAns = 1;
        int tempAns = 1;
        int i = 0;
        while (i < l) {
            if (hs.contains(nums[i] - 1)) {
                i++;
                continue;
            }
            int nextVal = nums[i] + 1;
            while (hs.contains(nextVal)) {
                tempAns++;
                nextVal++;
            }
            maxAns = Math.max(maxAns, tempAns);
            tempAns = 1;
            i++;
        }
        return maxAns;
    }
}
