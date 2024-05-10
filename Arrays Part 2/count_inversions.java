/*
Accepted
*/
import java.util.*;
class count_inversions{
    public static long getInversions(long arr[], int n) {
        long c=0;
        int j=0;
        for(int i=0;i<n-1;i++){
            j=i+1;
            while(j<n){
                if(arr[j]<arr[i]){
                    c++;
                }
                j++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long Arr[]=new long[N];
        for(int i=0;i<N;i++){
            Arr[i]=sc.nextLong();
        }
        long resp=getInversions(Arr, N);
        System.out.println(resp);
    }
}