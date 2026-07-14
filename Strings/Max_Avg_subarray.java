/*
Problem: Maximum Average Subarray I (LeetCode 643)

Approach:
1. Calculate the sum of the first k elements.
2. Store it as the current maximum sum.
3. Use the Sliding Window technique:
   - Add the next element entering the window.
   - Remove the element leaving the window.
4. Update the maximum sum if the current window sum is larger.
5. Return the maximum sum divided by k as the maximum average.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i < nums.length; i++) {

            sum += nums[i];
            sum -= nums[i - k];

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}