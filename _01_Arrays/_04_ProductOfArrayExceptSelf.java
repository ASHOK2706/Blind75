/*
LeetCode - 238. Product of Array Except Self
https://leetcode.com/problems/product-of-array-except-self/description/

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */


import java.util.Arrays;
import java.util.Scanner;

public class _04_ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(productExceptSelf(arr, n)));
    }

    private static int[] productExceptSelf(int[] arr, int n) {
        int[] result = new int[n];

        result[0] = 1;
        int pre = 1;
        for (int i=1; i<n; i++) {
            pre = pre * arr[i-1];
            result[i] = pre;
        }
        int suff = 1;
        for (int i=n-2; i>=0; i--) {
            suff = suff * arr[i+1];
            result[i] = result[i] * suff;
        }
        return result;
    }
}
