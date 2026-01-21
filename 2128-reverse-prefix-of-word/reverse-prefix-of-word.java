class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> s=new Stack<>();
        int i;
        for( i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                s.push(word.charAt(i));
                break;
            }
            s.push(word.charAt(i));
        }
        if(i==word.length()) return word;

        String ans="";
        while(!s.isEmpty()){
            ans=ans+s.pop();
        }
        ans=ans+word.substring(i+1);

        return ans;
    }
}