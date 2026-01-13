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
    public ListNode sortList(ListNode head) {
          if(head==null||head.next==null)return head;
        ListNode middle = findMiddle(head);
        //store middle.next at right before breaking the list
        ListNode right = middle.next;
        middle.next = null;
        
        ListNode left = head;

        right = sortList(right);
        left = sortList(left);
        //return head
        return mergeLL(right,left);
    }
    
    
     ListNode findMiddle(ListNode head){
        ListNode fast = head.next;//the fast will stop at the first middle
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
     }
     
    ListNode mergeLL(ListNode list1,ListNode list2){
        //empty list
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next = list1;
                temp = list1;
                list1=list1.next;
            }else{
                temp.next = list2;
                temp = list2;
                list2=list2.next;
            }
        }
        //remaining element
        if(list1!=null){
            temp.next=list1;
        }else{
            temp.next=list2;
        }
        return dummyNode.next;
    }

}