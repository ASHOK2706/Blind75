/*
LeetCode - 15. 3Sum
https://leetcode.com/problems/3sum/description/

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _09_3Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(threeSum(arr, n));
    }

    private static List<List<Integer>> threeSum(int[] arr, int n) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0; i<n; i++) {
            if (i>0 && arr[i] == arr[i-1]) continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    while (j<k && arr[j] == arr[j-1]) j++;
                    while (j<k && arr[k] == arr[k+1]) k--;
                }
            }
        }
        return ans;
    }
}
