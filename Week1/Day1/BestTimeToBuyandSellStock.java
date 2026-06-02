class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int mini = prices[0];
        for (int i = 1;i<prices.length;i++){
            int cost = prices[i] - mini;
            profit = Integer.max(profit,cost);
            mini=Integer.min(mini,prices[i]);
        }
        return(profit);
    }
}
