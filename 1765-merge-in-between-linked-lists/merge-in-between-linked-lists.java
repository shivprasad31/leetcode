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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode tail=list1;
        for(int i=0;i<a-1;i++){
            temp=temp.next;
        }
        for(int i=0;i<b+1;i++){
            tail=tail.next;
        }
        temp.next=list2;
        ListNode temp2=list2;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=tail;

        return list1;
        
    }
}