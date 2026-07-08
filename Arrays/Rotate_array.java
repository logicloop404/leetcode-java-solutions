/*
Problem: 189. Rotate Array

Approach:
- Calculate k % n.
- Reverse the entire array.
- Reverse the first k elements.
- Reverse the remaining elements.
- This rotates the array in-place.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k %= n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}