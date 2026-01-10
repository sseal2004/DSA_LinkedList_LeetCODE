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
    public boolean hasCycle(ListNode head) {
        ListNode fast =head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            //move fast ahead by 2 step
            fast = fast.next.next;
            //move slow ahead by 1 step
            slow=slow.next;
            if(fast == slow )return true;
        }
        return false;
    }

}