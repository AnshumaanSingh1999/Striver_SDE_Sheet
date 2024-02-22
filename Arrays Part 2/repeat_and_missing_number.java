/*
Accepted
*/
import java.util.*;
public class repeat_and_missing_number {
    public int[] repeatedNumber(final int[] A) {
        int x[]=new int[2];
        int m=0;
        int r=0;
        int max=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:A){
            if(hm.containsKey(i)==false){
                hm.put(i, 1);
            }
            else if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
        }
        for(int i=1;i<=A.length;i++){
            if(hm.containsKey(i)){
                if(hm.get(i)>max){
                    max=hm.get(i);
                    r=i;
                }
            }
            if(hm.containsKey(i)==false){
                m=i;
            }
        }
        x[1]=m;
        x[0]=r;
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        repeat_and_missing_number cl=new repeat_and_missing_number();
        int resp[]=cl.repeatedNumber(a);
        for(int i:resp){
            System.out.println(i);
        }
    }    
}