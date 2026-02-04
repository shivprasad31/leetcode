class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;

        for(int[] account :accounts){
            int wealth=0;
            for(int i=0;i<account.length;i++){
                wealth+=account[i];
            }
            maxWealth=Math.max(wealth,maxWealth);;
        }
        return maxWealth;
    }
}