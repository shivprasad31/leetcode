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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode temp2=dummy;
        ListNode temp=head;
        int sum=0;
        while(temp!=null){
            if(temp.val==0){
                ListNode n=new ListNode(sum);
                temp2.next=n;
                temp2=temp2.next;
                sum=0;
            }else{
                sum+=temp.val;
            }
            temp=temp.next;
        }
        return dummy.next.next;
    }
}