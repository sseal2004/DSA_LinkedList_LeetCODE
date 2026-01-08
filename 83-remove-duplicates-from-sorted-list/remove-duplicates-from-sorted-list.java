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
    public ListNode deleteDuplicates(ListNode head) {
        //deletion
        if(head==null)return null;
            ListNode temp=head;//initially
           while (temp != null && temp.next != null) {
                if(temp.val ==temp.next.val){
                    temp.next=temp.next.next;//just skip the node
                }
                else{
                temp=temp.next;
                }

            }
            return head;

    }
}