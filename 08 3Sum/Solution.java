/*
Problem : 
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:
The solution set must not contain duplicate triplets.

Example:
Given array nums = [-1, 0, 1, 2, -1, -4],
A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

*/

/*
Analysis ::
Time Complexity :: O(n)
Space Complexity :: O(n)
*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1])
                continue;
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r] == 0){
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l<r && nums[l] == nums[l+1])
                        l++;
                    while(l<r && nums[r] == nums[r-1])
                        r--;
                    l++;
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r] < 0)
                    l++;
                else
                    r--;
            }
        }
        return result;
    }
}