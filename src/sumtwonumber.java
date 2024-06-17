import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sumtwonumber {


    public static void main(String[] args) {
        int i = 10;
        int [] array ={1,2,3,5,6,7} ;
        twosum(array,i);
        twoSum(array,i);
        System.out.println(Arrays.toString(twosum(array,i)));
        System.out.println(Arrays.toString(twoSum(array,i)));



    }
    //两数之和
    //第一种暴力解法，根据数组长度
    public static int[]twosum(int[]nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[0];
    }

//第二种写法，用哈希表
    //把所有小于target值的存进hash表
    //遍历数组，如果hash表中存在target-nums[i]的值，则返回这两个值的下标
    public static int[] twoSum(int[] nums, int target) {
        //设一个新数组，用map是因为取值更方便
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
             //把所有小于目标值的值存储在hash表里面
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}




