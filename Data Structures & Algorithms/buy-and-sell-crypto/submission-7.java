class Solution {
    public int maxProfit(int[] prices) {


        int min=prices[0];
        int index=0;
        int bestSell=0;

        int maxDifference=0;


        for(int i=0;i < prices.length ;i++){

            for(int j=i+1;j<prices.length;j++){


                if(maxDifference< prices[j]-prices[i]){
                    maxDifference = prices[j]-prices[i];
                }


            }
        }



        return maxDifference;


    }
}
