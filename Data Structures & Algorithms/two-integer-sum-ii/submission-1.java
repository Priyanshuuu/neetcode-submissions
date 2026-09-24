class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while(nums[i] + nums[j] != target) {
            if(nums[i] + nums[j] < target) i++;
            if(nums[i] + nums[j] > target) j--;
        }
        return new int[]{i+1,j+1};
    }
}
