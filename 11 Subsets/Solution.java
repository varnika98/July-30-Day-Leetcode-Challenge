/*
Problem : 
Given a set of distinct integers, nums, return all possible subsets (the power set).
Note: The solution set must not contain duplicate subsets.

Example:
Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

*/

/*
Analysis ::
Time Complexity :: O(n)
Space Complexity :: O(n)
*/

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int l;
    
    public List<List<Integer>> subsets(int[] nums) {
        l=nums.length;
        Arrays.sort(nums);
        backtracking(new ArrayList<>(), nums, 0);
        return result;
    }
    
    private void backtracking(List<Integer> tempList, int[] nums, int start){
        result.add(new ArrayList<>(tempList));
        for(int i=start; i<l; i++){
            tempList.add(nums[i]);
            backtracking(tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}