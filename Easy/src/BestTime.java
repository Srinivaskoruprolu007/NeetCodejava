public class BestTime {
    public static void main(String[] args) {
        int[] prices = {7,1,2,5,6};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int val : prices){
            min = Math.min(min,val);
            ans = Math.max(ans,val-min);
        }
        return ans;
    }
}
