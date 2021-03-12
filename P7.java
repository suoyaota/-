/**
 * 链接：https://ac.nowcoder.com/acm/contest/5652/G
 * 来源：牛客网
 *
 * 输入描述:
 * 输入数据有多组, 每行表示一组输入数据。
 *
 * 每行不定有n个整数，空格隔开。(1 <= n <= 100)。
 * 输出描述:
 * 每组数据输出求和的结果
 * 示例1
 * 输入
 * 1 2 3
 * 4 5
 * 0 0 0 0 0
 * 输出
 * 6
 * 9
 * 0
 */

import java.util.Scanner;

public class P7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] nums = sc.nextLine().split(" ");
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += Integer.parseInt(nums[i]);
            }
            System.out.println(sum);
        }
    }
}