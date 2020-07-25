/*
Problem : 
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
Find the minimum element.
The array may contain duplicates.

Example 1:
Input: [1,3,5]
Output: 1

Example 2:
Input: [2,2,2,0,1]
Output: 0

*/

/*
Analysis ::
Time Complexity :: O(logn)
Space Complexity :: O(1)
*/

class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            int m = l + (r-l)/2;
            if(nums[m] > nums[r])
                l = m+1;
            else if(nums[m] < nums[r])
                r = m;
            else
                r--;
        }
        return nums[l];
    }
}