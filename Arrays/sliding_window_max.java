/*
Problem: Sliding Window Maximum (LeetCode 239)

Approach:
1. Traverse every possible window of size k.
2. For each window, find the maximum element by scanning all k elements.
3. Store the maximum in the answer array.

Time Complexity: O(n × k)
Space Complexity: O(1) (excluding the output array)

Note:
This is the brute-force approach and may result in
Time Limit Exceeded (TLE) for large inputs.
*/

class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] ans = new int[nums.length - k + 1];

        // Traverse every window
        for (int i = 0; i <= nums.length - k; i++) {

            int max = nums[i];

            // Find the maximum element in the current window
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }

            // Store the maximum
            ans[i] = max;
        }

        return ans;
    }
}