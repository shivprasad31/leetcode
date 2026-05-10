class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n*2];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[n+i]=nums[n-1-i];
        }
        return ans;
    }
}