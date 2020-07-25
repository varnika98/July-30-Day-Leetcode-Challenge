/*
Problem : 
You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.
Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.

Example 1:
Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
Output: [1,2,3,7,8,11,12,9,10,4,5,6]

Example 2:
Input: head = [1,2,null,3]
Output: [1,3,2]

*/

/*
Analysis ::
Time Complexity :: O(n)
Space Complexity :: O(n)
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null)
            return head;
        Node temp = head;
        while(temp != null){
            if(temp.child == null){
                temp = temp.next;
                continue;
            }
            Node child = temp.child;
            while(child.next != null)
                child = child.next;
            child.next = temp.next;
            if(temp.next != null)
                temp.next.prev = child;
            temp.next = temp.child;
            temp.child.prev = temp;
            temp.child = null;
        }
        return head;
    }
}