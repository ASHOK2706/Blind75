import java.util.Scanner;

/*
LeetCode - 190. Reverse Bits
https://leetcode.com/problems/reverse-bits/description/


 */
public class _05_ReverseBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(reverseBits(n));
    }

    private static int reverseBits(int n) {
        int result = 0;
        for (int shift = 31; shift >= 0; shift--) {
            int bit = n & 1;
            result += (bit << shift);
            n = n >> 1;
        }
        return result;
    }
}
