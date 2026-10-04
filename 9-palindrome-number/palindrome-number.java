class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        int n=x;
        int i=0;
        while(x>0){
            int rem=x%10;
            i=(i*10)+rem;
            x/=10;
        }
        return n==i;
        
    }
}