class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            mp.merge(i, 1, Integer::sum);
            if (mp.get(i) > 1) return true;
        }
        return false;
    }
}