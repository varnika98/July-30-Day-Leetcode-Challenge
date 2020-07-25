/*
Problem : 
Remove all elements from a linked list of integers that have value val.

Example:
Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5


Example 2:
Input: "cbbd"
Output: "bb"

*/

/*
Analysis ::
Time Complexity :: O(n)
Space Complexity :: O(n)
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val)
            head = head.next;
        
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.val == val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }
}