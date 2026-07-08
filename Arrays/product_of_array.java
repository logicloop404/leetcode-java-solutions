/*
Problem: 238. Product of Array Except Self

Approach:
- Create an answer array to store prefix products.
- In the first pass, store the product of all elements to the left of each index.
- In the second pass, traverse from right to left while maintaining a suffix product.
- Multiply the prefix product with the suffix product to get the final answer.
- This approach avoids using division and works in linear time.

Time Complexity: O(n)
Space Complexity: O(1) (excluding the output array)
*/

class Solution {

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }


        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}