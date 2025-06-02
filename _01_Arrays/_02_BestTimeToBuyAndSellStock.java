/*
LeetCode - 121. Best Time to Buy and Sell Stock
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
*/

import java.util.Scanner;

public class _02_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] prices = new int[n];
        for (int i=0; i<n; i++) {
            prices[i] = in.nextInt();
        }
        System.out.println(getMaxProfit(prices));
    }

    private static int getMaxProfit(int[] prices) {
        int maxProfit = 0;
        int minimumCost = prices[0];
        for (int i=1; i<prices.length; i++) {
            int profit = prices[i] - minimumCost;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < minimumCost) {
                minimumCost = prices[i];
            }
        }
        return maxProfit;
    }
}
