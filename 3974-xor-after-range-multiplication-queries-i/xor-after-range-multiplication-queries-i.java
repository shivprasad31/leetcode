class Solution {
    static final int MOD = 1_000_000_007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] query : queries){
            opertion(nums,query);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }

    public void opertion(int[] nums,int[] query){
        int start=query[0];
        while(start<=query[1]){
            nums[start] = (int)(((long) nums[start] * query[3]) % MOD);
            start+=query[2];
        }
    }
}