class Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();
        String[] p = path.split("/");

        for (String s : p) {

            if (s.equals("") || s.equals(".")) {
                continue;
            }

            if (s.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(s);
            }
        }

        if (st.isEmpty()) {
            return "/";
        }

        StringBuilder ans = new StringBuilder();
        for (String s : st) {
            ans.append("/").append(s);
        }

        return ans.toString();
    }
}
