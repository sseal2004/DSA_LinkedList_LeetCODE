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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int[] freq = new int[100001];

        for (int num : nums) {
            freq[num]++;
        }

        while (head != null && freq[head.val] > 0) {
            head = head.next;
        }

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            if (freq[curr.val] > 0) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
}
