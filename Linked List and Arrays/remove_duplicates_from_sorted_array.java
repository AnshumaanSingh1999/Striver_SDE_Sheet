/*
Accepted
 */
import java.util.*;
public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int c=0;
        HashSet<Integer> hs=new HashSet<>();
        Arrays.sort(nums);
        for(int i:nums){
            hs.add(i);
        }
        c=hs.size();

        int t[]=new int[c];
        int i=0;
        for(int x:hs){
            t[i]=x;
            i++;
        }

        for(int j=0;j<nums.length;j++){
            if(j<c){
                nums[j]=t[j];
            }
            else if(j>=c){
                nums[j]=Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<m;i++){    
            arr[i]=sc.nextInt();
        }
        remove_duplicates_from_sorted_array cl=new remove_duplicates_from_sorted_array();
        int resp=cl.removeDuplicates(arr); 
        System.out.println(resp);      
    }
}