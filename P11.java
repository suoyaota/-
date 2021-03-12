/**
 *链接：https://ac.nowcoder.com/acm/contest/5652/K
 * 来源：牛客网
 *
 * 这不是系统的错，可能是因为
 * 1.你对题目理解错了，你的代码只过了样例或你自己的数据
 * 2.你的代码逻辑有问题，你的代码只过了样例或你自己的数据
 * 总之就是你的代码只是过了样例和自测数据，后台的测试数据你根本不可见，要多自己思考。
 *
 * 这个题目如果你提交后通过率为0，又觉得自己代码是正确的，可以 点击查看 通过的代码
 *
 * 谨记：
 * 当你笔试的时候怀疑系统或者题目数据有问题的时候请务必先怀疑自己的代码!
 * 当你笔试的时候怀疑系统或者题目数据有问题的时候请务必先怀疑自己的代码!
 *
 * 请帮忙把这个练习专题发给你的朋友同学吧，感谢感谢
 * 输入描述:
 * 输入有多组测试用例，每组空格隔开两个整数
 * 输出描述:
 * 对于每组数据输出一行两个整数的和
 * 示例1
 * 输入
 * 1 1
 * 输出
 * 2
 */

/**
 * 本题输入没有描述 爆int
 */

import java.util.Scanner;

public class P11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(a + b);
        }
    }
}