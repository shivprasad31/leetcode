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
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int[] arr=new int[size];

        temp=head;
        int i=0;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
        }
        Arrays.sort(arr);

        ListNode newHead=new ListNode(0);
        temp=newHead;
        i=0;
        while(i<arr.length){
            ListNode n=new ListNode(arr[i++]);
            temp.next=n;
            temp=temp.next;
        }
        return newHead.next;
        
    }
}