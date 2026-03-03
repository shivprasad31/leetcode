class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int toFind=target-nums[i];
            if(set.contains(toFind)){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==toFind){
                        ans[0]=i;
                        ans[1]=j;
                        return ans;
                    }
                }
            }

        }
        return ans;
        
    }
}