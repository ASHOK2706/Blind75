import java.util.Scanner;

/*
LeetCode - 338. Counting Bits
https://leetcode.com/problems/counting-bits/description/

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 */
public class _04_CountingBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] ans = countBits(n);
        for (int i=0; i<=n; i++) {
            System.out.print(ans[i] +" ");
        }
    }
    private static int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i=1; i<=n; i++) {
            arr[i] = 1 + arr[i & i-1];
        }
        return arr;
    }
}
