/*
Problem: 1. Two Sum

Approach:
- Create a HashMap to store each number along with its index.
- Traverse the array once.
- For each element, calculate the complement (target - current element).
- Check if the complement already exists in the HashMap.
- If it exists, return the indices of the complement and the current element.
- Otherwise, store the current element and its index in the HashMap.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}