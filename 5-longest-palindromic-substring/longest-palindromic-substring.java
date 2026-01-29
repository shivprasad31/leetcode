class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;

        String longest = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            int left = i - 1;
            int right = i + 1;

            while (left >= 0 && right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            String temp = s.substring(left + 1, right);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            temp = s.substring(left + 1, right);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
        }

        return longest;
    }
}
