/*
Problem: Search Insert Position (LeetCode 35)

Approach:
1. Use Binary Search on the sorted array.
2. If the target is found, return its index.
3. If the target is greater than the middle element,
   search the right half.
4. Otherwise, search the left half.
5. If the target is not found, the 'start' pointer
   indicates the correct insertion position.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (nums[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        // Target not found, return insertion index
        return start;
    }
}