/*
Problem: 88. Merge Sorted Array

Approach:
- Use three pointers.
- i points to the last element of nums1.
- j points to the last element of nums2.
- k points to the last position of nums1.
- Compare elements from the end and place the larger element at nums1[k].
- Continue until all elements of nums2 are merged.

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}