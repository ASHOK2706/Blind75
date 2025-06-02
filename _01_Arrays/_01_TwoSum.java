/*
LeetCode - 1. Two Sum
https://leetcode.com/problems/two-sum/description/
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class _01_TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }


    private static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            int remaining = target - arr[i];
            if (map.containsKey(remaining)) {
                return new int[]{map.get(remaining), i};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}


























