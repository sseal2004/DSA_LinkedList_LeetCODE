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
    public ListNode insertionSortList(ListNode head) {
       ListNode dummy = new ListNode(0); // sorted list head

        while (head != null) {
            ListNode curr = head;       // node to insert
            head = head.next;           // move ahead

            ListNode prev = dummy;
            // find position
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // insert
            curr.next = prev.next;
            prev.next = curr;
        }
        return dummy.next;

        }
    }
