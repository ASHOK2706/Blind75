import java.util.Scanner;

/*
LeetCode - 152. Maximum Product Subarray
https://leetcode.com/problems/maximum-product-subarray/description/

Input: nums = [2,3,-2,4]
Output: 6
 */
public class _06_MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(getMaxProfit(arr, n));
    }

    private static int getMaxProfit(int[] arr, int n) {
        int maxProduct = Integer.MIN_VALUE;
        int prefixproduct = 1;
        int suffixProduct = 1;
        for (int i=0; i<n; i++) {
            if (prefixproduct == 0) prefixproduct = 1;
            if (suffixProduct == 0) suffixProduct = 1;

            prefixproduct *= arr[i];
            suffixProduct *= arr[n-i-1];
            maxProduct = max(maxProduct, max(prefixproduct, suffixProduct));
        }
        return maxProduct;
    }

    private static int max(int x, int y) {
        return (x > y) ? x : y;
    }
}
