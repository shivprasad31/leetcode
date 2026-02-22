class Solution {

    static int[] fact = {
        1, 1, 2, 6, 24, 120,
        720, 5040, 40320, 362880
    };

    public boolean isDigitorialPermutation(int n) {

        int S = sumFactDigits(n);
        if (sumFactDigits(S) != S) return false;
        return sameDigits(n, S);
    }

    private int sumFactDigits(int x) {
        int sum = 0;
        while (x > 0) {
            sum += fact[x % 10];
            x /= 10;
        }
        return sum;
    }

    private boolean sameDigits(int a, int b) {
        int[] count = new int[10];

        while (a > 0) {
            count[a % 10]++;
            a /= 10;
        }

        while (b > 0) {
            count[b % 10]--;
            b /= 10;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}