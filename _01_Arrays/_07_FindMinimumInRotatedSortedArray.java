/*
LeetCode - 153. Find Minimum in Rotated Sorted Array
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 */

import java.util.Scanner;

public class _07_FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(getMinimum(arr, n));
    }

    private static int getMinimum(int[] arr, int n) {
        int minimumValue = Integer.MAX_VALUE;
        int low = 0;
        int high = n-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[mid]) {
                if (arr[low] < minimumValue) {
                    minimumValue = arr[low];
                }
                low = mid + 1;
            } else {
                if (arr[mid] < minimumValue) {
                    minimumValue = arr[mid];
                }
                high = mid - 1;
            }
        }
        return minimumValue;
    }
}
