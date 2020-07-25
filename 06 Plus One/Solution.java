/*
Problem : 
Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

*/

/*
Analysis ::
Time Complexity :: O(n)
Space Complexity :: O(1)
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        int l = digits.length;
        digits[l-1] += 1;
        for(int i=l-1; i>=0; i--){
            digits[i] = digits[i]+carry;
            if(digits[i] > 9){
                digits[i] %= 10;
                carry=1;
            }
            else{
                carry = 0;
                break;
            }
        }
        if(carry == 1){
            int arr[] = new int[l+1];
            arr[0] = carry;
            return arr;
        }
        return digits;
    }
}

// class Solution {
//     public int[] plusOne(int[] digits) {
//      for(int i = digits.length-1; i>=0 ; i--){
//          if(digits[i]<9){
//              digits[i]++;
//              return digits;
//          }
//          digits[i]=0;
//      }   
//         int arr[] = new int[digits.length+1];
//         arr[0]=1;
//         return arr;
//     }
// }