class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int k=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[k++]=nums[i];
            }else{
                neg[j++]=nums[i];
            }
        }
        k=0;
        j=0;
        for(int i=0;i<nums.length;i+=2){
            nums[i]=pos[k++];
        }
        for(int i=1;i<nums.length;i+=2){
            nums[i]=neg[j++];
        }
        return nums;
    }
}