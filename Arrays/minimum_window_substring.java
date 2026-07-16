/*
Problem: Minimum Window Substring (LeetCode 76)

Approach:
1. Store the frequency of characters in string t.
2. Expand the sliding window using the right pointer.
3. Reduce the required character count whenever a needed character is found.
4. Once all characters are included, try shrinking the window
   from the left to get the minimum valid window.
5. Update the minimum window whenever a smaller valid window is found.

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

class Solution {

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] count = new int[128];

        for (char c : t.toCharArray()) {
            count[c]++;
        }

        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int required = t.length();

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            if (count[current] > 0) {
                required--;
            }

            count[current]--;

            while (required == 0) {

                if (right - left + 1 < minLen) {

                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                count[leftChar]++;

                if (count[leftChar] > 0) {
                    required++;
                }

                left++;
            }
        }

        if(minLen==Integer.MAX_VALUE){
            return "";
        }
        else{
            return s.substring(start,start+minLen);
        }
    }
}