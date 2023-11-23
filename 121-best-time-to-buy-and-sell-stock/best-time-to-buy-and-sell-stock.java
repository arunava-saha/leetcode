class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int a = Integer.MAX_VALUE, b = 0;
        for(int i = 0; i<n; i++){
            if(prices[i]<a){
                // max=b-a;
                a=prices[i];
                b=0;
                continue;
            }
            if(b<prices[i]){
                b=prices[i];
                if(b-a>max){
                max=b-a;

                }
            }
        }
        return max;
    }
}