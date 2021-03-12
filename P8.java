/**
 * 链接：https://ac.nowcoder.com/acm/contest/5652/H
 * 来源：牛客网
 *
 * 输入描述:
 * 输入有两行，第一行n
 *
 * 第二行是n个空格隔开的字符串
 * 输出描述:
 * 输出一行排序后的字符串，空格隔开，无结尾空格
 * 示例1
 * 输入
 * 5
 * c d a bb e
 * 输出
 * a bb c d e
 */










import java.util.Scanner;
import java.util.Arrays;




public class P8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = sc.next();
        }
        Arrays.sort(str);
//         for (int i = num - 1; i > 0; i--) {
//             boolean isSorted = true;
//             for (int j = 0; j <= i - 1 ; j++) {
//                 if (str[j].compareTo(str[j + 1]) > 0) {
//                     String temp = str[j];
//                     str[j] = str[j + 1];
//                     str[j + 1] = temp;
//                     isSorted = false;
//                 }
//             }
//             if (isSorted) {
//                 break;
//             }
//         }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(str[i]);
            if (i != num - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}