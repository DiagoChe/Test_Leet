class Solution {
    public String addBinary(String a, String b) {
                StringBuilder result = new StringBuilder();
        
        int al = a.length()-1;
        int bl = b.length()-1;
        int carry = 0;
        
        while( al >=0  || bl >=0 )
        {
            int sum = carry;
            if(al >= 0)
            {
                sum += (a.charAt(al) - '0');
                al--;
            }
            if(bl >= 0)
            {
                sum += (b.charAt(bl) - '0');
                bl--;
            }
            result.append(sum%2);   //��ӽ��
            carry = sum /2;         //��λ�������1��ôcarry=0�������2��Ҫ��λ������һλ+1
        }
        
        if(carry !=0 )              //��������ˣ���Ҫ��λ�����
            result.append(1);
        
        return result.reverse().toString();  //�ȷ�ת�������
    }
}