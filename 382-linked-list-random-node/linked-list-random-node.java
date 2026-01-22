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
    ListNode[]list=new ListNode[10000];
    int index=0;

    public Solution(ListNode head) {
        while(head!=null){
            list[index++]=head;
            head=head.next;
        }
    }
    
    public int getRandom() {
        if(index==0)return -1;
        return (list[new Random().nextInt(index)]).val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */