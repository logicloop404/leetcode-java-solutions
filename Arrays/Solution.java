/*
Problem: First Bad Version (LeetCode 278)

Approach:
1. Use Binary Search on versions 1 to n.
2. If the middle version is bad,
   search in the left half including mid.
3. If the middle version is good,
   search in the right half.
4. When start == end, it points to the
   first bad version.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

// The isBadVersion API is defined in the parent class VersionControl.
// boolean isBadVersion(int version);

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {

        int start = 1;
        int end = n;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}