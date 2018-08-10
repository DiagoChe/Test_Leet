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



//java中的charAt方法：一个能够用来检索特定索引下的字符的String实例的方法.
charAt()方法返回指定索引位置的char值。索引范围为0~length()-1.
如: str.charAt(0)检索str中的第一个字符,str.charAt(str.length()-1)检索最后一个字符.

对于栈stack来说：Stack.Peek 与 stack.pop 的区别
相同点：大家都返回栈顶的值。

不同点：peek 不改变栈的值(不删除栈顶的值)，pop会把栈顶的值删除。	