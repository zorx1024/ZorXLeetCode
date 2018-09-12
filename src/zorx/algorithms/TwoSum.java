package zorx.algorithms;

import java.util.Scanner;

/**
 * Created by ZorX on 2018/9/12.
 */
public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an array : ");
        String str = scanner.next();
        String[] strs = str.split(",");
        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.valueOf(strs[i]);
        }
        System.out.print("Input a target : ");
        int target = scanner.nextInt();
        int[] res = twoSum(nums, target);
        System.out.println("[" + res[0] + "," + res[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return  result;
    }
}
