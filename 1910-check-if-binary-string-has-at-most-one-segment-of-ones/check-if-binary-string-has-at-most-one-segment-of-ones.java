class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i=0;i<s.length();i++){
            if(i+1<s.length()&&s.charAt(i)=='0'&&s.charAt(i+1)=='1'){
                return false;
            }
        }
        return true;
        
    }
}