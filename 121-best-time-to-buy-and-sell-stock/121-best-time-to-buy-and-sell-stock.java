class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int idx = 0; idx<prices.length;idx++){
            if(minprice>prices[idx]){
                minprice = prices[idx];
            }else if(prices[idx]-minprice>maxprofit){ 
                maxprofit = prices[idx]-minprice;
            }
        }
        return maxprofit;
    }
}