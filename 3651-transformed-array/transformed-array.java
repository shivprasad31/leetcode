class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] result=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int shift = nums[i];
            int targetIndex = ((i + shift) % n + n) % n; 
            result[i] = nums[targetIndex];
        }
        return result;
    }
}