class Solution {
    public int maxProfit(int[] prices){
        int n = prices.length;
        int profit = 0;
        int i = 0;
        for(int j = 1;j<n;j++){
            if(prices[j]<prices[i]){
                i=j;
            }
            else{
                profit = Math.max(profit,prices[j]-prices[i]);
            }
            }
        return profit;
    }
        
    }