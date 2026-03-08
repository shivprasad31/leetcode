class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set=new HashSet<>();
        substring("",nums.length,set);
        HashSet<String> given=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            given.add(nums[i]);
        }
        for(String s :set){
            if(!given.contains(s)){
                return s;
            }
        }
        return "";
    }
    public void substring(String s,int n,HashSet<String> set){
        if(n==0){
            set.add(s);
            return;
        }
        substring(s+"1",n-1,set);
        substring(s+"0",n-1,set);
    }
}