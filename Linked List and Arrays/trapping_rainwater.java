/*
Accepted
*/
import java.util.*;
public class trapping_rainwater {
    public int trap(int[] height) {
        int water=0;
        int j;
        int n=height.length;
        for(int i=0;i<n;i++){
            int lm=0;
            int rm=0;
            j=i;
            while (j>=0) {
                lm=Math.max(height[j], lm);
                j--;
            }
            j=i;
            while (j<n) {
                rm=Math.max(height[j], rm);
                j++;
            }
            water=water+Math.min(lm, rm)-height[i];
        }
        
        return water;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        trapping_rainwater obj=new trapping_rainwater();
        int resp=obj.trap(a);
        System.out.println(resp);
    }   
}