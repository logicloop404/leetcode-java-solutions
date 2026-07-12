/*
Problem: Container With Most Water (LeetCode 11)

Approach:
1. Use two pointers, one at the beginning and one at the end of the array.
2. Calculate the width between the two pointers.
3. The water level is determined by the shorter line.
4. Compute the area using:
      Area = width × min(height[left], height[right])
5. Update the maximum area found so far.
6. Move the pointer with the smaller height inward because it is the limiting factor.
7. Continue until both pointers meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);

            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}