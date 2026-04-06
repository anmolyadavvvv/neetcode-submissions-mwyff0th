class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minBuyPrice = prices[0];

        for(int sell : prices){
            maxP = Math.max(maxP , sell - minBuyPrice);
            minBuyPrice = Math.min(minBuyPrice,sell);
        }
        return maxP;
    }
}
