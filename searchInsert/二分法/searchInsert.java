class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;

        int i = 0, j = nums.length;
        int mid = (i + j) / 2;
        while (i < j) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                if (j == mid) break;
                j = mid;
                mid = (i + j) / 2;
            } else {
                if (i == mid) break;
                i = mid;
                mid = (i + j) / 2;
            }
        }

        return j;
    }
}