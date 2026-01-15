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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null&&n==1){
            head=null;
            return head;
        }
        if(n==1){
            ListNode temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            return head;
        }
        int len=findLen(head);
        ListNode temp=head;
        if(len==n){
            head=head.next;
            return head;
        }
        for(int i=0;i<len-n-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
        
    }
    public int findLen(ListNode head){
        int listLen=0;
        ListNode temp=head;
        while(temp!=null){
            listLen+=1;
            temp=temp.next;
        }
        return listLen;
    }

}