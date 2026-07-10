/*
Problem: Length of Last Word (LeetCode 58)

Approach:
1. Split the string into words using one or more spaces as the delimiter.
2. Store all words in a string array.
3. Access the last word in the array.
4. Return the length of the last word.

Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        int n=words.length;
        String lastWord=words[n-1];
        int num=lastWord.length();
        return num;
    }
}
// approach 2:
// * Approach:
//  1. Start traversing the string from the last character.
//  2. Skip all trailing spaces.
//  3. Count characters until a space or the beginning of the string is reached.
//  4. Return the count, which represents the length of the last word.
// class Solution {
//     public int lengthOfLastWord(String s) {
//         int i=s.length()-1;
//         int count=0;
//         while(i>=0 && s.charAt(i)==' '){
//             i--;
//         }
//         while(i>=0 && s.charAt(i)!=' '){
//             count++;
//             i--;
//         }
//         return count;
//     }
// }