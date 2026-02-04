class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;
    }
    public int search(int[] nums,int target,boolean isFirst){
        int pos=-1;

        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                pos=mid;
                if(isFirst){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return pos;
    }
}