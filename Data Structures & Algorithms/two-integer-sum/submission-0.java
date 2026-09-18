class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> faah = new HashMap();
        for(int idx  = 0; idx < nums.length ; idx++) {
            if (faah.containsKey(target-nums[idx])) {
                return new int[]{faah.get(target-nums[idx]), idx};
            }
            faah.put(nums[idx], idx);
        }
        return new int[]{0,1};
    }
}
