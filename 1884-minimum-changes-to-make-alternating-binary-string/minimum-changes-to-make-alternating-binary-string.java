class Solution {
    public int minOperations(String s) {
        String version1=startWith0(s.length());
        String version2=startWith1(s.length());
        int op1=0,op2=0;
        //check for version1
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=version1.charAt(i)){
                op1++;
            }
            if(s.charAt(i)!=version2.charAt(i)){
                op2++;
            }
        }
        return Math.min(op1,op2);
    }
    public String startWith0(int n){
        StringBuffer ans=new StringBuffer("");
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans.append("0");
            }else{
                ans.append("1");
            }
        }
        return ans.toString();
    }

    public String startWith1(int n){
        StringBuffer ans=new StringBuffer("");
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans.append("1");
            }else{
                ans.append("0");
            }
        }
        return ans.toString();
    }
}