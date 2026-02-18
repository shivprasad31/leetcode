class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuffer bin=binary(n);

        int curr=0;
        int next=1;
        int len=bin.length();

        while(next<len){
            if(bin.charAt(curr)==bin.charAt(next)){
                return false;
            }
            next++;
            curr++;
        }

        return true;
        
    }
    public StringBuffer binary(int n){
        StringBuffer bin=new StringBuffer();
        while(n>0){
            bin.append(n%2);
            n/=2;
        }
        return bin.reverse();
    }
}