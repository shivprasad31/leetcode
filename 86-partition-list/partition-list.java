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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(0);
        ListNode newHead=dummy;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                ListNode n=new ListNode(temp.val);
                dummy.next=n;
                dummy=dummy.next;
            }
            temp=temp.next;
        }
        // ListNode nt=new ListNode(x);
        // dummy.next=nt;
        // dummy=dummy.next;

        temp=head;
        while(temp!=null){
            if(temp.val>=x){
                ListNode n=new ListNode(temp.val);
                dummy.next=n;
                dummy=dummy.next;
            }
            temp=temp.next;
        }
        return newHead.next;
    }
}