/*
Problem: Binary Search (LeetCode 704)

Approach:
1. Initialize two pointers:
   - start = 0
   - end = nums.length - 1
2. Find the middle index.
3. If the middle element equals the target, return its index.
4. If the target is greater than the middle element,
   search in the right half.
5. If the target is smaller than the middle element,
   search in the left half.
6. If the target is not found, return -1.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            // Calculate the middle index safely
            int mid = start + (end - start) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Search in the right half
            else if (nums[mid] < target) {
                start = mid + 1;
            }

            // Search in the left half
            else {
                end = mid - 1;
            }
        }

        // Target not found
        return -1;
    }
}