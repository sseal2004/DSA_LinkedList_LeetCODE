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
     ListNode removeList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            //swap curr.next and prev
            ListNode temp =curr.next;
            curr.next=prev;
            prev= temp;
            //swap curr and prev
            ListNode swap =curr;
            curr = prev;
            prev= swap;

        }
        return prev;
    }

   ListNode removeNodes(ListNode head){
        head=removeList(head);
            for (ListNode p = head; p != null && p.next != null; ) {
             if (p.val > p.next.val)
            p.next = p.next.next;
            else
            p = p.next;
            }
            return removeList(head);
   }
}