class Solution {
    public int countSeniors(String[] details) {
        int ans=0;
        for(String person :details ){
            int age=Integer.parseInt(person.substring(11,13));
            if(age>60){
                ans+=1;
            }
        }
        return ans;
    }
}