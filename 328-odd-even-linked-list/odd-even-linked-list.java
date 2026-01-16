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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenStart = even;
        while(even!=null && even.next!=null){
            //case 1 when odd is head
            odd.next=even.next;
            odd=odd.next;//traverse
            //case2 when even is head
            even.next =odd.next;
            even = even.next;

        }
        odd.next=evenStart;//place the first even node after the last odd node.
        return head;
    }
}