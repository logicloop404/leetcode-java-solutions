/*
Problem: Search a 2D Matrix (LeetCode 74)

Approach:
1. Treat the matrix as a sorted 1D array.
2. Apply Binary Search from index 0 to m*n - 1.
3. Convert the middle index into row and column:
   row = mid / columns
   col = mid % columns
4. Compare the value with the target.

Time Complexity: O(log(m*n))
Space Complexity: O(1)
*/

class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            }

            if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}