 public class buyandsellstocks {

    public static int buyandsellsto(int prices[]){
        int buyprice = Integer.MAX_VALUE;// initialising buyprice with + infinity
        int maxprofit = 0;

        for(int i= 0; i<prices.length; i++){
            if(buyprice < prices[i]){// profit ayega is case m
                int profit = prices[i] - buyprice;// today's profit
                maxprofit =  Math.max(maxprofit, profit);//global profit saare din ka jo milake ayega usme se maxium wale din ka profit
            }else{
                buyprice = prices[i];
            }
        }
        return maxprofit ;

    }
    

    public static void main(String args []){
        int prices[] = {7, 1, 5, 3, 6, 4};//O(n) time complexity
        System.out.println(buyandsellsto(prices));

    }
}
