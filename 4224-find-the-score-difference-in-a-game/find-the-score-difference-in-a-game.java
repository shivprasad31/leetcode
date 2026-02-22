class Solution {
    public int scoreDifference(int[] nums) {

        int p1 = 0, p2 = 0;
        int active = 1; // 1 = Player1, 2 = Player2

        for (int i = 0; i < nums.length; i++) {

            // Rule 1: odd points → swap
            if (nums[i] % 2 == 1) {
                active = 3 - active; // toggles 1 <-> 2
            }

            // Rule 2: every 6th game → swap
            if ((i + 1) % 6 == 0) {
                active = 3 - active;
            }

            // Give points
            if (active == 1) {
                p1 += nums[i];
            } else {
                p2 += nums[i];
            }
        }

        return p1 - p2;
    }
}