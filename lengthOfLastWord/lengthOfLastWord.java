class Solution {
        public boolean isChar(char c){
        int i=(int)c;
        if((i>=65&&i<=90)||(i>=97&&i<=122)){
            return true;
        }
        return false;
    }
    public int lengthOfLastWord(String s) {
        if(s==null){
            return 0;
        }
      boolean isEnd=false;
        int result=0;
        for(int i=s.length()-1;i>=0;i--){ 
            if(isEnd){
                break;
            }
            if(isChar(s.charAt(i))){  
                isEnd=true;
                result++;
                i--;
                while(i>=0){
                    if(isChar(s.charAt(i))){
                        result++;
                        i--;
                    }else{
                        break;
                    }
                }
            }
        }
        return result;
    }
}