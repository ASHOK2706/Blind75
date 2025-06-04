/*
LeetCode - 191. Number of 1 Bits
https://leetcode.com/problems/number-of-1-bits/description/

Input: n = 11
Output: 3
Explanation: The input binary string 1011 has a total of three set bits.
 */

import java.util.Scanner;

public class _02_NumberOf1Bits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(hammingWeight(n));
    }
    private static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n & (n - 1));
        }
        return count;
    }
}
