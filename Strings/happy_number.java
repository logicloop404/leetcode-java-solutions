/*
Problem: Happy Number (LeetCode 202)

Approach:
1. Repeatedly replace the number with the sum of the squares of its digits.
2. Use a HashSet to store previously seen numbers.
3. If the number becomes 1, it is a happy number.
4. If a number repeats, a cycle exists, so it is not a happy number.

Time Complexity: O(log n)
Space Complexity: O(log n)
*/

import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {

            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private int getNext(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}