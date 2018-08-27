class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        int nodeLen = 2*numRows-2;//������֮��Ĳ� Ҳ���ǵȲ������е�d
        String result = "";
 
        if (len == 0 || numRows == 0 || numRows == 1)//����������⴦��
            return s;
 
        for (int i = 0; i < numRows; i++)//�ӵ�һ�б��������һ��
            for (int j = i; j < len; j += nodeLen) {
                result += s.charAt(j);//��һ�к����һ�� ������ͨ�е���������
                if (i != 0 && i != numRows-1 && j - 2*i + nodeLen < len)
                    result += s.charAt(j - 2*i + nodeLen);//�����е�����
            }
 
        return result ;
    }
}