/*
LeetCode - 268. Missing Number
https://leetcode.com/problems/missing-number/description/

Input: nums = [3,0,1]
Output: 2
 */

import java.util.Scanner;

public class _03_MissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(getMissingNumber(arr, n));
    }
    private static int getMissingNumber(int[] arr, int n) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i=0; i<n; i++) {
            xor1 = xor1 ^ (i+1);
            xor2 = xor2 ^ arr[i];
        }
        return xor1 ^ xor2;
    }
}
