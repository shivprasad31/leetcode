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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode nextNode=head.next;
        do{
            int v=temp.val;
            temp.val=nextNode.val;
            nextNode.val=v;
            if(nextNode.next==null){
                break;
            }
            temp=nextNode.next;
            if(temp.next==null){
                break;
            }
            nextNode=temp.next;
        }while(nextNode!=null);

        return head;
    }
}