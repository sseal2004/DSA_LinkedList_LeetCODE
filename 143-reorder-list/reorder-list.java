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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)return;
        ListNode mid = middleLinkedList(head);
                
        ListNode headsecond = reverseLL(mid);

        ListNode headFirst = head;
        while(headFirst!=null && headsecond!=null ){
            ListNode temp = headFirst.next;
            headFirst.next = headsecond;
            headFirst=temp;

            temp=headsecond.next;
            headsecond.next=headFirst;
            headsecond = temp;
        }
        if(headFirst!=null){
            headFirst.next=null;
        }
    }
    
    public static ListNode middleLinkedList(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f!=null&&f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
     public static ListNode reverseLL(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode newhead = reverseLL(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;

     }

}