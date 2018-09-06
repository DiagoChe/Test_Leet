class Solution{
	private int max= Integer.MIN_VALUE;
	public int maxSubArray(int[] nums){
		int sum;
		for(int i=0;i<nums.length;i++){
			for(int j=1;j<nums.length;j++){
				sum=0;
				for(int k=i;k<=j;k++){
					sum+=nums[k];
				}
				if(sum>max){
					max=sum;
				}
			}
		}
		return max;
	}	
}

