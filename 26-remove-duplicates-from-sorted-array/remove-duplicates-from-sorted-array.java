class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int right=1;
        int dupli=1;
        while(right<nums.length){
            while(right<nums.length&&nums[left]==nums[right]){
                right++;
            }
            if(right==nums.length){
                return dupli;
            }
            nums[++left]=nums[right];
            dupli++;
            right++;
        }
        return dupli;
    }
}