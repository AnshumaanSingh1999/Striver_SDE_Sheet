/*
Accepted
*/
import java.util.*;
public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int x[]=new int[2];
        int d=0;
        int i1=0;
        int i2=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            d=target-nums[i];
            if(hm.containsKey(d)){
                if(i!=hm.get(d)){
                    x[0]=i;
                    x[1]=hm.get(d);
                }
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
        int target=sc.nextInt();
        two_sum cl=new two_sum();
        int resp[]=cl.twoSum(a,target);
        for(int i:resp){
            System.out.println(i);
        }
    }
}