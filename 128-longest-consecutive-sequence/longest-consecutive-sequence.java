class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        int maxCount=1;

        for(int i :set){
            
            if(!set.contains(i-1)){
                int count=1;
                while(set.contains(i+1)){
                    count+=1;
                    i+=1;
                }
                maxCount=Math.max(count,maxCount);
            }
            
        }

        return maxCount;
    }
}