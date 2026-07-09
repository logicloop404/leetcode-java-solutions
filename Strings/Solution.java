
/*
Problem: Reverse String (LeetCode 344)

Approach:
1. Use two pointers.
2. One pointer starts from the beginning and the other from the end.
3. Swap both characters.
4. Move both pointers toward the center.
5. Continue until they meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;

        }
    }
} {
    
}
