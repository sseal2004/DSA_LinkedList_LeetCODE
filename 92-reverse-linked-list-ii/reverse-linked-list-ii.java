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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null)return head;
        if(left==right)return head;

        ListNode prev=null;
        ListNode curr=head;
        //skip first left-1 nodes
        for(int i=1;curr!=null&& i<left;i++){
            prev=curr;//store curr in prev
            curr=curr.next;//curr moved forward
        }
        ListNode firstLeft=prev;
        ListNode secondLeft=curr;
        ListNode next=curr.next;
        //now just reverse between left and right
        for(int i =0;curr!=null&&i<right-left+1;i++){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(firstLeft!=null){
            firstLeft.next=prev;
        }else{
            head=prev;
        }
        secondLeft.next=curr;
        return head;       
    }
}