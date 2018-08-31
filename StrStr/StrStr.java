class Solution {
    public int strStr(String haystack, String needle) {
            	//当needle为空则返回0
		if(needle.equals(""))
			return 0;
		
		int len = needle.length();
	//查看haystack字符串是否包含有needle字符串
		for(int i=0; i<haystack.length()-len+1;i++) {
			if(haystack.substring(i, i+len).equals(needle)) {
				return i;
			}
		}
        return -1;
    }
}