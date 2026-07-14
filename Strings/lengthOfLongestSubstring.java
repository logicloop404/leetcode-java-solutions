/*
Problem: Longest Substring Without Repeating Characters (LeetCode 3)

Approach:
1. Use the Sliding Window technique with two pointers (left and right).
2. Maintain a HashSet to store unique characters in the current window.
3. Expand the window by moving the right pointer.
4. If a duplicate character is found, remove characters from the left
   until the duplicate is removed.
5. Update the maximum length after every valid window.

Time Complexity: O(n)
Space Complexity: O(min(n, m))
where m is the size of the character set.
*/

import java.util.HashSet;

class Solution {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {

                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}