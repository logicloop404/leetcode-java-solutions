/*
Problem: Majority Element (LeetCode 169)

Approach:
1. Maintain a candidate and a count.
2. If count becomes 0, select the current element as the new candidate.
3. If the current element equals the candidate, increment the count.
4. Otherwise, decrement the count.
5. The final candidate is the majority element because it appears more than n/2 times.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(candidate==num){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}