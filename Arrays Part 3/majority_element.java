/*
Accepted
*/
import java.util.*;
public class majority_element {
    public int majorityElement(int[] nums) {
        int m=0;
        int e=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            if(hm.containsKey(x)){
                hm.put(x, hm.get(x)+1);
            }
            else if(hm.containsKey(x)==false){
                hm.put(x, 1);
            }
        }
        for(int i:hm.keySet()){
            if(hm.get(i)>m){
                m=hm.get(i);
                e=i;
            }
        }
        return e;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        majority_element cl=new majority_element();
        int resp=cl.majorityElement(a);
        System.out.println(resp);
    }   
}