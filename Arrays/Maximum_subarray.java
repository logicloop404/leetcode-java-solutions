/*
Problem: 53. Maximum Subarray
Approach:
- Use Kadane's Algorithm.
- Traverse the array while maintaining a running sum.
- If the running sum becomes negative, reset it to 0.
- Update the maximum sum whenever a larger sum is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = nums[0];

        for (int num : nums) {

            if (currentSum < 0) {
                currentSum = 0;
            }

            currentSum += num;

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}