/*
Problem: Valid Parentheses (LeetCode 20)

Approach:
1. Use a stack to store opening brackets.
2. Push '(', '{', '[' onto the stack.
3. For every closing bracket:
   - If the stack is empty, return false.
   - Pop the top element and check if it matches.
4. If all brackets match and the stack is empty,
   return true.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}