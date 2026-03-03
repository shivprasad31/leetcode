class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";
        
        for (int i = 1; i < n; i++) {
            String inverted = invert(s);
            String reversed = reverse(inverted);
            
            s = s + "1" + reversed;
        }
        
        return s.charAt(k - 1);   // important fix
    }

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public String invert(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0')
                sb.setCharAt(i, '1');
            else
                sb.setCharAt(i, '0');
        }
        
        return sb.toString();
    }
}