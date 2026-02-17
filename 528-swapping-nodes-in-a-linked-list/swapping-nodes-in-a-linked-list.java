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
        int len=length(head);
        ListNode temp=head;

        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        //storing value 1
        int val1=temp.val;

        temp=head;

        for(int i=1;i<=len-k;i++){
            temp=temp.next;
        }
        int val2=temp.val;
        temp.val=val1;

        temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        temp.val=val2;

        return head;

        
    }
    public int length(ListNode head){
        int length=0;
        ListNode temp=head;

        while(temp!=null){
            length++;
            temp=temp.next;
        }

        return length;
    }
}