/**
 * 链接：https://ac.nowcoder.com/acm/contest/5652/I
 * 来源：牛客网
 *
 * 输入描述:
 * 多个测试用例，每个测试用例一行。
 *
 * 每行通过空格隔开，有n个字符，n＜100
 * 输出描述:
 * 对于每组测试用例，输出一行排序过的字符串，每个字符串通过空格隔开
 * 示例1
 * 输入
 * a c bb
 * f dddd
 * nowcoder
 * 输出
 * a bb c
 * dddd f
 * nowcoder
 */


import java.util.Scanner;
import java.util.Arrays;

public class P9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String[] str = sc.nextLine().split(" ");

            int num = str.length;
            for (int i = num - 1; i > 0; i--) {
                boolean isSorted = true;
                for (int j = 0; j < i; j++) {
                    if (str[j].compareTo(str[j + 1]) > 0) {
                        String tmp = str[j];
                        str[j] = str[j + 1];
                        str[j + 1] = tmp;
                        isSorted = false;
                    }
                }
                if (isSorted) {
                    break;
                }
            }

            //Arrays.sort(str);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length; i++) {
                sb.append(str[i]);
                if (i != str.length - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}