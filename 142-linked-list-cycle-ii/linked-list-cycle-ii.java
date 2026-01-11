/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length=0;
        ListNode fast =head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
         fast = fast.next.next;
         slow = slow.next;
         if(fast==slow) {
            length= lengthOfCycle(slow);
            break;
         }
        }
        //find the start
        //take two pointer
        if(length==0)return null;
        ListNode first =head;
        ListNode second = head;
        while(length>0){
            second = second.next;//move pointer second
            length--;
        }
        //keeping moving both forward and they will meet at cycle start
        while(first!=second){
            first=first.next;
            second=second.next;
        }
        return second;
    }
    static int lengthOfCycle(ListNode head){
         ListNode fast =head;
        ListNode slow=head;
       while(fast!=null&&fast.next!=null){ 
        fast=fast.next.next;
        slow = slow.next;

        ListNode temp= slow;
        int length =0;
        if(fast==slow){
        do{
            temp = temp.next;
            length++;
        }while(temp!=slow);


        return length;
        }
       }
       return 0;
    }
}