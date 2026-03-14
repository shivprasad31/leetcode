class Solution {
    public String getHappyString(int n, int k) {
        List<String> st=new ArrayList<>();
        allHappy("",n,-1,st);
        if(k>st.size()){
            return "";
        }
        return st.get(k-1);

    }
    public static void allHappy(String s, int n, int i, List<String> st) {
        if (n == 0) {
            st.add(s);
            return;
        }
        if (s.isEmpty()) {
            allHappy(s + "a", n - 1, i + 1, st);
            allHappy(s + "b", n - 1, i + 1, st);
            allHappy(s + "c", n - 1, i + 1, st);
        }
        if (i >= 0 && s.charAt(i) == 'a') {
            allHappy(s + "b", n - 1, i + 1, st);
            allHappy(s + "c", n - 1, i + 1, st);
        }
        if (i >= 0 && s.charAt(i) == 'b') {
            allHappy(s + "a", n - 1, i + 1, st);
            allHappy(s + "c", n - 1, i + 1, st);
        }
        if (i >= 0 && s.charAt(i) == 'c') {
            allHappy(s + "a", n - 1, i + 1, st);
            allHappy(s + "b", n - 1, i + 1, st);
        }
    }
}