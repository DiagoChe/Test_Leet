class Solution {
        public int maxSubArray(int[] nums) {
        int current=nums[0];
        int sum=nums[0];
        //���ǿ������ȫ�Ǹ�������ô�������ĸ�����������ĺ�Ϊ������ô��ʹ��ɨ�跨
        for(int i=1;i<nums.length;i++) {
            if(current<0)current=nums[i];//��ǰ��С��0 �϶�����ȥ�����򽫻�Ӱ��������ĺͣ�����Ϊ��һ����
            else current+=nums[i];//�����ǰ����С��0����ô����Խ������ĺ��л���Ӱ��
            if(current>sum)sum=current;//�����ʵ���˸����������Ҳʵ����ɨ�跨
            //������ʵ�Ѿ���ʽ���о������п��ܣ����������п��ܵ����ֵ
        }
        return sum;
    }
}