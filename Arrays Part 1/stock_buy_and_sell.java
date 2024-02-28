/*
Accepted
*/
import java.util.*;
public class stock_buy_and_sell {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int profit=0;
        int minprice=Integer.MAX_VALUE;
        for(int i:prices){
            if(i<minprice){
                minprice=i;
            }
            else if(i>minprice){
                profit=i-minprice;
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        stock_buy_and_sell cl=new stock_buy_and_sell();
        int resp=cl.maxProfit(a);
        System.out.println(resp);
    }
}