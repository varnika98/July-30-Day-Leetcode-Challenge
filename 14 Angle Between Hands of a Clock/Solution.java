/*
Problem : 
Given two numbers, hour and minutes. Return the smaller angle (in degrees) formed between the hour and the minute hand.

Example 1:
Input: hour = 12, minutes = 30
Output: 165

Example 2:
Input: hour = 3, minutes = 30
Output: 75

Example 3:
Input: hour = 3, minutes = 15
Output: 7.5

Example 4:
Input: hour = 4, minutes = 50
Output: 155

Example 5:
Input: hour = 12, minutes = 0
Output: 0

*/

/*
Analysis ::
Time Complexity :: O(1)
Space Complexity :: O(1)
*/

class Solution {
    public double angleClock(int hour, int minutes) {
         // Degree covered by hour hand (hour area + minutes area)
        double h = (hour%12 * 30) + ((double)minutes/60 * 30);
        
         // Degree covered by minute hand (Each minute = 6 degree)
        double m = minutes * 6;
        
         // Absolute angle between them
        double angle = Math.abs(m - h);
        
         // If the angle is obtuse (>180), convert it to acute (0<=x<=180)
        if (angle > 180) angle = 360.0 - angle;
        
        return angle;
    }
}