/*
Problem : 
Implement pow(x, n), which calculates x raised to the power n (xn).

Example 1:
Input: 2.00000, 10
Output: 1024.00000

Example 2:
Input: 2.10000, 3
Output: 9.26100

Example 3:
Input: 2.00000, -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25

*/

/*
Analysis ::
Time Complexity :: O(n)
Space Complexity :: O(n)
*/

// Recursive
class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n == Integer.MIN_VALUE){
            x *= x;
            n >>= 1;
        }
        if(n<0){
            n = -n;
            x = 1/x;
        }
        
        return ( n%2 == 0) ? myPow(x*x, n/2) : x * myPow(x*x, n/2);
    }
}


// Iterative
// class Solution {
//     public double myPow(double x, int n) {
//         long m = n>= 0 ? n : -(long)n;
//         double ans = 1.0;
//         while(m > 0){
//             if( (m & 1) == 1)
//                 ans *= x;
//             x *= x;
//             m >>= 1;
//         }
//         return n>=0 ? ans : 1/ans;
//     }
// }
