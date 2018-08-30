AC代码如下

    public class leetcode26 {
        public static void main(String[] args) {
            leetcode26 lt = new leetcode26();
            int []num = {};
            System.out.println(lt.removeDuplicates(num));
        }
     
        // 扔进去AC了他
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0)
                return 0;
            //判断无输入
            int number = 0;//标记计数
            for (int i=0; i < nums.length ; i++) {
                if ( nums[i] != nums[number] ) {
                    number++;
                    nums[number] = nums[i];
                }
            }
            number+=1; //标记+1即为数字个数
            return number;
        }
     
    }