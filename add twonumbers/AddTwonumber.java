ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode tmp = null;
    ListNode result = null;

    int carry = 0;
    while (l1 != null || l2 != null || carry != 0) {
        int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
        carry = sum / 10;

        ListNode node = new ListNode(sum % 10);
        if (tmp == null) {
            tmp = node;
            result = tmp;
        } else {
            tmp.next = node;
            tmp = tmp.next;
        }

        l1 = l1 == null ? null : l1.next;
        l2 = l2 == null ? null : l2.next;
    }

    return result;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
//定义了两个栈ListNode节点指针（tmp,result）,进位carry 
//链表对应结点相加时增加前一个结点的进位，并保存下一个结点的进位；除法得进位，模得结果；
//两个链表长度不一致时，要处理较长链表剩余的高位和进位计算的值； 
如果最高位计算时还产生进位，则还需要添加一个额外结点。