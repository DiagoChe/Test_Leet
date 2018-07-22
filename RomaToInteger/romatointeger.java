class Solution {
    public int romanToInt(String s) {
        Hashtable<Char, Int> numbers = new Hashtable<Char, Int>();
    	numbers.put('I', 1);
    	numbers.put('V', 5);
    	numbers.put('X', 10);
    	numbers.put('L', 50);
    	numbers.put('C', 100);
    	numbers.put('D', 500);
    	numbers.put('M', 1000);
    	int sum =0,snum1 = 0,snum2 = 0;
    	for(int i =0;i<s.length()-1;i++)
    	{
    		snum1 = numbers.get(s.charAt(i));
    		snum2 = numbers.get(s.charAt(i+1));
    		if(snum1<snum2)
    			sum-=snum1;
    		else
    			sum+=snum1;
    	}
    	sum+=numbers.get(s.charAt(s.length()-1));
    	return sum;
    }
}