class Solution {
    public int[] diStringMatch(String s) {
        int[] ans=new int[s.length()+1];
        int d=s.length();
        int in=0;
        for(int i=0;i<ans.length;i++){
            if(i==ans.length-1){
                ans[i]=in;
                break;
            }
            if(s.charAt(i)=='D'){
                ans[i]=d--;
            }

            if(s.charAt(i)=='I'){
                ans[i]=in++;
            }
        }
        return ans;
    }
}