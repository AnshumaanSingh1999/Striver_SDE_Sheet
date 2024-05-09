/*
Partially Accepted
*/
import java.util.*;
class next_smaller_element{
    public int[] prevSmaller(int[] A) {
        int l=A.length;
        int g[]=new int[l];
        int j;
        int x=0;
        for(int i=0;i<l;i++){
            int m=-1;
            j=i-1;
            while(j>=0){
                if(A[j]<A[i]){
                    m=A[j];
                    break;
                }
                else{
                    m=-1;
                }
                j--;
            }
            g[x]=m;
            x++;
        }
        return g;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        next_smaller_element obj=new next_smaller_element();
        int resp[]=obj.prevSmaller(A);
        for(int z:resp){
            System.out.println(z);
        }
    }
}