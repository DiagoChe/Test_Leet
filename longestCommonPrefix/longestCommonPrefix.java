class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        for(int i=1;i<=strs[0].length();i++){
            String head = strs[0].substring(0,i);
            for(String str:strs){
                if(!str.startsWith(head))
                    return head.substring(0,i-1);
            }
        }
        return strs[0];

    }
}