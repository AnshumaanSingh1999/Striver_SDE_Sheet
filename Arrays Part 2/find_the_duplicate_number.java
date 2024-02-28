/*
Accepted
*/
import java.util.*;
public class find_the_duplicate_number {
    public int findDuplicate(int[] nums) {
        int x=0;
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i:nums){
            if(hm.containsKey(i)==false){
                hm.put(i, 1);
            }
            else if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
            if(hm.get(i)>1){
                x=i;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        find_the_duplicate_number cl=new find_the_duplicate_number();
        int resp=cl.findDuplicate(a);
        System.out.println(resp);       
    }
}