class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        if(j==1) return new int[]{1,2};
        while(i < j) {
            if(nums[i] + nums[j] == target) return new int[]{i+1,j+1};
            if(nums[i] + nums[j] < target){
                i++;
                continue;
            }
            if(nums[i] + nums[j] > target){
                j--;
                continue;
            }
        }
        return new int[]{i,j};
    }
}
