class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0;
        int mask = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            
            // Remove conflicts
            while ((mask & nums[right]) != 0) {
                mask ^= nums[left];
                left++;
            }

            // Add current element
            mask |= nums[right];

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}