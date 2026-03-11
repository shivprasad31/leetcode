class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        StringBuffer s = new StringBuffer("");
        while (n > 0) {
            int rem = n % 2;
            s.append(rem);
            n = n / 2;
        }
       // System.out.println(s);
        char[] ch = s.reverse().toString().toCharArray();
        StringBuffer s2 = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '1') {
                s2.append("0");
            } else {
                s2.append("1");
            }
        }
        //System.out.println(s2);
        int ans = 0;
        for (int i = 0; i < s2.length(); i++) {
            ans *= 2;
            if (s2.charAt(i) == '1') {
                ans += 1;
            }
        }
        return ans;
    }
}