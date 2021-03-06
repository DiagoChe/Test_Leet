/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//�ǵݹ�
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         
        ListNode temp1=l1;
        ListNode temp2=l2;
        
        ListNode ret=new ListNode(0);
        
        ListNode ret1=ret;
        while(temp1!=null&&temp2!=null){
            if(temp1.val>temp2.val){
                ret.next=temp2;
                ret=ret.next;
                temp2=temp2.next;
            }else{
                ret.next=temp1;
                ret=ret.next;
                temp1=temp1.next;
            }
            
        }
        if(temp1==null&&temp2!=null){
            ret.next=temp2;
        }
        
        if(temp1!=null&&temp2==null){
            ret.next=temp1;
        }
        
        return ret1.next;
    }
}