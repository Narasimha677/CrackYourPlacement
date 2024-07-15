package Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-min;
            if(profit>max){
                max=profit;
            }
            min=prices[i]<min?prices[i]:min;
        }
        return max;
    }
}
