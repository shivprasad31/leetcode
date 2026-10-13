class Solution {
    public int countPrimes(int n) {
        int ans=0;
        boolean[] nums=new boolean[n+1];
        for(int i=0;i<=n;i++){
            nums[i]=true;
        }

        for(int i=2;i*i<=n;i++){
            if(nums[i]){
                for(int j=i*i;j<=n;j+=i){
                    nums[j]=false;
                }
            }
        }

        for(int i=2;i<n;i++){
            if(nums[i]){
                ans++;
            }
        }
        return ans;
    }
}