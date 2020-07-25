/*
Problem : 
Given a non-empty array of integers, return the k most frequent elements.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

*/

/*
Analysis ::
Time Complexity :: O(n)
Space Complexity :: O(n)
*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        ArrayList[] arr = new ArrayList[nums.length];
        
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            int freq = entry.getValue() - 1;
            if(arr[freq] == null)
                arr[freq] = new ArrayList<>();
            arr[freq].add(entry.getKey());
        }
        int[] result = new int[k];
        int j = 0;
        for(int i=nums.length-1; i>=0 && j<k; i--){
            if(arr[i] != null)
                for(Object val : arr[i])
                    result[j++] = (int)val;
        }
        return result;
    }
}