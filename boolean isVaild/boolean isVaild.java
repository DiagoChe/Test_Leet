class Solution {
    public boolean isValid(String s) {
        if(s == "" || s.length() == 0)
            return true;
 
        Stack stack = new Stack();
        stack.push(s.charAt(0));
 
        for(int i=1; i<s.length(); i++){
            if(!stack.isEmpty()){
                if(stack.peek().equals((char)(s.charAt(i)-1)) || stack.peek().equals((char)(s.charAt(i)-2))){
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
 
        if(stack.isEmpty())
            return true;
 
        return false;
    }
}



//java�е�charAt������һ���ܹ����������ض������µ��ַ���Stringʵ���ķ���.
charAt()��������ָ������λ�õ�charֵ��������ΧΪ0~length()-1.
��: str.charAt(0)����str�еĵ�һ���ַ�,str.charAt(str.length()-1)�������һ���ַ�.

����ջstack��˵��Stack.Peek �� stack.pop ������
��ͬ�㣺��Ҷ�����ջ����ֵ��

��ͬ�㣺peek ���ı�ջ��ֵ(��ɾ��ջ����ֵ)��pop���ջ����ֵɾ����	