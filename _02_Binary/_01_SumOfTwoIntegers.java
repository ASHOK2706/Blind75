import java.util.Scanner;

/*
LeetCode - 371. Sum of Two Integers
https://leetcode.com/problems/sum-of-two-integers/description/

Input: a = 2, b = 3
Output: 5
 */
public class _01_SumOfTwoIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(getSum(a, b));
    }

    private static int getSum(int a, int b) {
        int carry = 0;
        while (b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
