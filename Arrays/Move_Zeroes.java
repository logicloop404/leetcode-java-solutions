/*
Problem: 283. Move Zeroes
Approach:
- Use two pointers.
- Pointer 'i' traverses the array.
- Pointer 'j' keeps track of the position where the next non-zero element should be placed.
- Whenever a non-zero element is found, swap it with nums[j].
- This keeps all non-zero elements in their original order while moving zeros to the end.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void moveZeroes(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
}