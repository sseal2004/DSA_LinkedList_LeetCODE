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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        //Initialize new head 
        ListNode ans = null;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<temp2.val){
                ans = inserAtlast(ans,temp1.val);//smaller
                temp1 = temp1.next;
            }else{
                ans = inserAtlast(ans,temp2.val);//smaller
                temp2 = temp2.next;
            }
            
        }
        //remaining element 
            while(temp1!=null){
                ans = inserAtlast(ans,temp1.val);
                temp1 = temp1.next;
            }
            while(temp2!=null){
                ans = inserAtlast(ans,temp2.val);
                temp2 = temp2.next;

            }
            return ans;

    }
    static ListNode inserAtlast(ListNode head,int val){
        
        ListNode newNode = new ListNode(val);
        if(head==null)return newNode;
        ListNode ptr = head;

        while(ptr.next!=null){
            ptr = ptr.next;
        }
        ptr.next=newNode;
        newNode.next=null;
        return head;
    }
}