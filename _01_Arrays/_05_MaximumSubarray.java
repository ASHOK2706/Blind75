/*
LeetCode - 53. Maximum Subarray
https://leetcode.com/problems/maximum-subarray/description/

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */

import java.util.Scanner;

public class _05_MaximumSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(getMaxSubArray(arr, n));
    }

    private static int getMaxSubArray(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
