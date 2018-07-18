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
//����������ջListNode�ڵ�ָ�루tmp,result��,��λcarry 
//�����Ӧ������ʱ����ǰһ�����Ľ�λ����������һ�����Ľ�λ�������ý�λ��ģ�ý����
//���������Ȳ�һ��ʱ��Ҫ����ϳ�����ʣ��ĸ�λ�ͽ�λ�����ֵ�� 
������λ����ʱ��������λ������Ҫ���һ�������㡣