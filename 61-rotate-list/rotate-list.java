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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        //  Find length and last node
        ListNode temp = head;
        int length = 1;

        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Make circular
        temp.next = head;

        // Find new tail
        k = k % length;
        int stepsToNewTail = length - k;

        ListNode newTail = temp;
        while (stepsToNewTail-- > 0) {
            newTail = newTail.next;
        }

        // Break circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
