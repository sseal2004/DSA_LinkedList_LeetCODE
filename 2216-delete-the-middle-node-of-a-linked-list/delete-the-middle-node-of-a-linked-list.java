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
    ListNode head;
    int size=0;
    public ListNode deleteMiddle(ListNode head) {
         if (head == null || head.next == null) return null;

        this.head = head;

        ListNode temp = head;
        size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;

        }

        deleteNodeKthIndex(size / 2);
        return this.head;
    }
     void deleteNodeKthIndex(int index){
    if (index < 0 || index >= size) return;
    if (index == 0) {
            head = head.next;
            size--;
            return;
        }

    ListNode temp=head;
     for(int i=0;i<index-1;i++){
        temp=temp.next;
     }
     temp.next=temp.next.next;
    size--;

    }
}