class Solution {
    public int binaryGap(int n) {
        int maxDistance=0;
        StringBuffer binary=binaryForm(n);

        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                int count=1;
                int j=i+1;
                while(j<binary.length()&&binary.charAt(j)!='1'){
                    count++;
                    j++;
                }
                if(j==binary.length()) count=0;
                maxDistance=Math.max(count,maxDistance);
            }

        }
        return maxDistance;
    }
    public StringBuffer binaryForm(int n){
        StringBuffer ans=new StringBuffer("");
        while(n>0){
            int rem=n%2;
            ans.append(rem);
            n=n/2;
        }
        return ans;
    }
}