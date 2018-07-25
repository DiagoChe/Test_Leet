/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//·ÇµÝ¹é
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode ret=getResult(temp1,temp2);

        return ret;
    }

    public ListNode getResult(ListNode t1,ListNode t2)
    {

        ListNode t0=new ListNode(0);
         ListNode head=t0;
        if(t1==null)
            return t2;
        if(t2==null)
            return t1;

        if(t1.val>t2.val)
        {
            t0.next=t2;
            t0=t0.next;
            t0.next=getResult(t1,t2.next);
        }else
        {
            t0.next=t1;
            t0=t0.next;
            t0.next=getResult(t1.next,t2);
        }
        return head.next;
    }
}