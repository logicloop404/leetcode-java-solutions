/*
Problem: Remove Duplicates from Sorted Array (LeetCode 26)

Approach:
1. Since the array is already sorted, duplicate elements appear next to each other.
2. Use two pointers:
   - 'i' keeps track of the last unique element.
   - 'j' scans the array.
3. If nums[j] is different from nums[i], increment 'i' and copy nums[j] to nums[i].
4. After the traversal, the first (i + 1) elements are unique.
5. Return (i + 1) as the number of unique elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {

                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}