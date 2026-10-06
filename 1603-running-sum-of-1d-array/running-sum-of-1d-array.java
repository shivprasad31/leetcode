class Solution {
    public int[] runningSum(int[] nums) {
        int s=nums[0];
        for(int i=1;i<nums.length;i++){
            s+=nums[i];
            nums[i]=s;
        }
        return nums;
        
    }
}