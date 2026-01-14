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
    public boolean isPalindrome(ListNode head) {
        //reverse half of the linked list after middle
        //find middle and keep checking whether middle is equal to head or not
        //compare the first half with second half
        //re reverse the second half
        ListNode mid = middleNode(head);
        ListNode headSecondHalf = ReverseLL(mid);//reverse the second half
        ListNode ReReverse = headSecondHalf;//store to reverse later
        boolean isPalin = true;

        //compare both the halves
        while(head!=null && headSecondHalf!=null){
            //keep comparing
            if(head.val!=headSecondHalf.val){
             isPalin = false;
             break;   
            }
            head=head.next;
            headSecondHalf=headSecondHalf.next;
            
        }
        ReverseLL(ReReverse);
        return isPalin;
    }
    public static  ListNode ReverseLL(ListNode head){
        
        if(head==null||head.next==null)return head;

        ListNode newHead = ReverseLL(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
   public static ListNode middleNode (ListNode head){

    ListNode fast = head;
    ListNode slow = head;
while (fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
    }
    return slow;

   }

}