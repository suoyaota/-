/**
 * 牛客输入输入练习
 * https://ac.nowcoder.com/acm/contest/5652#question
 * 11道题
 */


    /**
     *链接：https://ac.nowcoder.com/acm/contest/5652/A
     * 来源：牛客网
     *
     * 输入描述:
     * 输入包括两个正整数a,b(1 <= a, b <= 10^9),输入数据包括多组。
     * 输出描述:
     * 输出a+b的结果
     * 示例1
     * 输入
     * 1 5
     * 10 20
     * 输出
     * 6
     * 30
     */

    import java.util.Scanner;

    public class P1 {
        //在牛客上提交时修改类名P1为Main
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a + b);
            }
        }
    }

