class Solution {
    public int firstMissingPositive(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public void sort(int[] nums){
        int n=nums.length;
        int i=0;
        while(i<n){
            int expected=nums[i]-1;
            if(nums[i]>0&&nums[i]<=n&&nums[i]!=nums[expected]){
                int temp=nums[i];
                nums[i]=nums[expected];
                nums[expected]=temp;
            }else{
                i++;
            }
        }
    }
}