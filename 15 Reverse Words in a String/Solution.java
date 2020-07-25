/*
Problem : 
Given an input string, reverse the string word by word.

Example 1:
Input: "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: "  hello world!  "
Output: "world! hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:
Input: "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

*/

/*
Analysis ::
Time Complexity :: O(n)
Space Complexity :: O(n)
*/

class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0)
            return "";
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            if(!arr[i].isEmpty()){
                res.append(arr[i]);
                if(i != 0)
                    res.append(" ");
            }
        }
        return res.toString().trim();
    }
}