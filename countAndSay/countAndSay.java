class Solution {
    public String countAndSay(int n) {
        String start="1";
        int num=0,count=0,i=0;
        char tmp;
        while(n-->1){
            char chars[]=start.toCharArray();
            StringBuilder sb=new StringBuilder();
            i=0;
            while(i<chars.length){
                count=0;
                tmp=chars[i];
                while(i<chars.length && chars[i]==tmp){
                    count++;
                    i++;
                }
                sb.append(count+""+tmp);  
            }
            start=sb.toString();
        }
        return start;
    }
}