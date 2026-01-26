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
    static boolean findTarget(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
        if(target==arr[i])return true;
        }
        return false;
    }
    public int numComponents(ListNode head, int[] nums) {
        int connected=0;
        int found =0;
        while(head!=null){
            if(findTarget(nums,head.val)){
                found++;
                if(found==1){
                    connected++;
                }
            }
            else{
                found=0;
            }
            head = head.next;
        }
        return connected;
        
        
    }
}