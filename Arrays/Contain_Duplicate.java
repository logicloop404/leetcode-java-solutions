/*
Problem: 217. Contains Duplicate
Link: https://leetcode.com/problems/contains-duplicate/

Approach:
- Use a HashSet to store the elements seen so far.
- Traverse the array one element at a time.
- If the current element already exists in the HashSet,
  return true because a duplicate is found.
- Otherwise, add the element to the HashSet.
- If no duplicates are found after traversing the entire array,
  return false.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}