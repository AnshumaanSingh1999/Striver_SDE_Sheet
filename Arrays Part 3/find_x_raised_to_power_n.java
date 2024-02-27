/*
Accepted
*/
import java.util.*;
public class find_x_raised_to_power_n {
    public static double myPow(double x, int n) {
        double r=Math.pow(x,n);
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        int n=sc.nextInt();
        double r=myPow(x, n);
        System.out.println(r);
    }
}