/*
Problem: Sort Colors (LeetCode 75)

Approach:
1. Use three pointers:
   - low: Points to the position where the next 0 should be placed.
   - mid: Traverses the array.
   - high: Points to the position where the next 2 should be placed.
2. If nums[mid] is:
   - 0: Swap with nums[low], then increment both low and mid.
   - 1: It is already in the correct position, so increment mid.
   - 2: Swap with nums[high], then decrement high.
     Do not increment mid because the swapped element needs to be checked.
3. Continue until mid crosses high.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}