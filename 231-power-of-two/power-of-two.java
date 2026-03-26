class Solution {
    public boolean isPowerOfTwo(int n) {
        long i=1;
        while(i<=n){
            if(n==i) return true;
            i=i*2;
        }
        return false;
    }
}