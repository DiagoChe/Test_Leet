class Solution {
        private int max = Integer.MIN_VALUE;
        public int maxSubArray(int[] nums) {
        int sum;
        for (int i = 0; i < nums.length; i++) {// 子序列左端点
            sum = 0;
            for (int j = i; j < nums.length; j++) {// 子序列右端点
                
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}