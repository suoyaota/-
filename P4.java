/**
 * 链接：https://ac.nowcoder.com/acm/contest/5652/D
 * 来源：牛客网
 *
 * 计算一系列数的和
 * 打开以下链接可以查看正确的代码
 * https://ac.nowcoder.com/acm/contest/5657#question
 *
 * 输入描述:
 * 输入数据包括多组。
 * 每组数据一行,每行的第一个整数为整数的个数n(1 <= n <= 100), n为0的时候结束输入。
 * 接下来n个正整数,即需要求和的每个正整数。
 * 输出描述:
 * 每组数据输出求和的结果
 * 示例1
 * 输入
 * 4 1 2 3 4
 * 5 1 2 3 4 5
 * 0
 * 输出
 * 10
 * 15
 */



import java.util.*;

public class P4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<>();
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            int sum = 0;
            while(num-- > 0) {
                sum += sc.nextInt();
            }
            ans.add(sum);
        }
        for (int a : ans) {
            System.out.println(a);
        }
    }
}
