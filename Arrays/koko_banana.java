/*
Problem: Koko Eating Bananas (LeetCode 875)

Approach:
1. The minimum possible eating speed is 1 banana/hour.
2. The maximum possible eating speed is the largest pile.
3. Use Binary Search on the eating speed.
4. For each speed, calculate the total hours required to finish all piles.
5. If the total hours are within h, store the speed as a possible answer
   and try a smaller speed.
6. Otherwise, increase the eating speed.
7. Return the minimum valid eating speed.

Time Complexity: O(n × log(maxPile))
Space Complexity: O(1)
*/

class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Find the maximum pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = calculateHours(piles, mid);

            if (hours <= h) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    // Calculate total hours required at a given eating speed
    private long calculateHours(int[] piles, int speed) {

        long hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1) / speed; // Ceiling division
        }

        return hours;
    }
}