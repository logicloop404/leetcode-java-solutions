/*
Problem: Valid Palindrome II (LeetCode 680)

Approach:
1. Use two pointers (left and right) to compare characters from both ends.
2. If the characters match, move both pointers inward.
3. If a mismatch occurs, try skipping either the left character or the right character.
4. Check if either resulting substring is a palindrome.
5. If either check returns true, the string can become a palindrome by deleting at most one character.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                return isPalindrome(s, left + 1, right) ||
                       isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}