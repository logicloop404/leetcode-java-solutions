/*
LeetCode 162 - Find Peak Element

Approach:
- Use Binary Search.
- Compare nums[mid] with nums[mid + 1].
- If nums[mid] > nums[mid + 1], we are on a descending slope,
  so the peak lies at mid or to its left.
- Otherwise, we are on an ascending slope,
  so the peak lies to the right.

Time Complexity: O(log n)
Space Complexity: O(1)
*/
class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int high=nums.length-1;
        while(start<high){
            int mid=start+(high-start)/2;
            if(nums[mid]>nums[mid+1]){
                high=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;

    }
}