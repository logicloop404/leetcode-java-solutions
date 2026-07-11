/*
Problem: Ransom Note (LeetCode 383)

Approach:
1. Create a frequency array of size 26 to count letters in magazine.
2. Traverse the magazine and store the frequency of each character.
3. Traverse the ransomNote:
   - If the required character is unavailable, return false.
   - Otherwise, decrease its count.
4. If all characters are successfully matched, return true.

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {

            if (count[c - 'a'] == 0) {
                return false;
            }

            count[c - 'a']--;
        }

        return true;
    }
}