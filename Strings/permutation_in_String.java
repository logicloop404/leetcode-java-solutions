/*
Problem: Permutation in String (LeetCode 567)

Approach:
1. If s1 is longer than s2, return false.
2. Create two frequency arrays of size 26:
   - One for characters in s1.
   - One for the current window in s2.
3. Initialize both arrays with the first window.
4. Slide the window through s2:
   - Add the new character entering the window.
   - Remove the character leaving the window.
5. After each slide, compare both frequency arrays.
6. If they are equal, a permutation of s1 exists in s2.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        if (matches(s1Count, windowCount)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {

            windowCount[s2.charAt(i) - 'a']++;

            windowCount[s2.charAt(i - s1.length()) - 'a']--;

            if (matches(s1Count, windowCount)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] s1Count, int[] windowCount) {

        for (int i = 0; i < 26; i++) {

            if (s1Count[i] != windowCount[i]) {
                return false;
            }
        }

        return true;
    }
}