/*
LeetCode - 11. Container With Most Water
https://leetcode.com/problems/container-with-most-water/description/

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
 */

import java.util.Scanner;

public class _10_ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] height = new int[n];
        for (int i=0; i<n; i++) {
            height[i] = in.nextInt();
        }

        System.out.println(getMaxArea(height, n));
    }

    private static int getMaxArea(int[] height, int n) {
        int leftHeight = 0;
        int rightHeight = n - 1;
        int area = 0;
        int maxArea = Integer.MIN_VALUE;
        while (leftHeight < rightHeight) {
            if (height[leftHeight] <= height[rightHeight]) {
                area = height[leftHeight] * (rightHeight - leftHeight);
                leftHeight++;
            } else {
                area = height[rightHeight] * (rightHeight - leftHeight);
                rightHeight--;
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}
