class Solution {
        private int max = Integer.MIN_VALUE;
        public int maxSubArray(int[] nums) {
        int sum;
        for (int i = 0; i < nums.length; i++) {// ��������˵�
            sum = 0;
            for (int j = i; j < nums.length; j++) {// �������Ҷ˵�
                
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}