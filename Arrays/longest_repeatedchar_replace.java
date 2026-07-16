/*
Problem: Longest Repeating Character Replacement (LeetCode 424)

Approach:
1. Use the Sliding Window technique.
2. Maintain the frequency of characters in the current window.
3. Track the maximum frequency of any character.
4. If the number of characters to replace exceeds k,
   shrink the window from the left.
5. Keep updating the maximum window size.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int characterReplacement(String s, int k) {

        int[] count = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            count[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {

                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}