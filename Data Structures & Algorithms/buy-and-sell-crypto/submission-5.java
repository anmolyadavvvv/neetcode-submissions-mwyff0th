class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit  = 0;
        int minSell = prices[0];

        for(int sell : prices){
            maxProfit = Math.max(maxProfit,sell-minSell);
            minSell = Math.min(minSell,sell);
        }
        return maxProfit;
    }
}
