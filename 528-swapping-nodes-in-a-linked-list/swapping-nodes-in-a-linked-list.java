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
    public ListNode swapNodes(ListNode head, int k) {
        //initially both at head
        ListNode kthNodeFromStart = head;
        ListNode kthNodeFromEnd = head;
        ListNode temp = head;
        //Move first pointer to k-th node from start
        for(int i=1;i<k;i++){
            kthNodeFromStart = kthNodeFromStart.next;
        }
        //Move fast pointer to kth step ahead
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        while(temp!=null){
            temp=temp.next;
            kthNodeFromEnd=kthNodeFromEnd.next;
        }
        //swap the val
        int swap = kthNodeFromStart.val;
        kthNodeFromStart.val=kthNodeFromEnd.val;
        kthNodeFromEnd.val=swap;

        return head;

        

    }
}