/*
Accepted
*/
import java.util.Scanner;
public class sort_an_array_of_0s_1s_and_2s {
    public void sortColors(int[] nums) {
        int l=nums.length;
        int c0=0, c1=0,c2=0;
        for(int i=0;i<l;i++){
            if(nums[i]==0){
                c0++;
            }
            else if(nums[i]==1){
                c1++;
            }
            else if(nums[i]==2){
                c2++;
            }
        }
        for(int i=0;i<l;i++){
            if(i<c0){
                nums[i]=0;
            }
            else if(i<c0+c1 && i>=c0){
                nums[i]=1;
            }
            else if(i<c0+c1+c2 && i>=c0+c1){
                nums[i]=2;
            }
        }
        // For Printing Sorted Array!
        // for(int i=0;i<l;i++){
        //     System.out.println(nums[i]);
        // }  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort_an_array_of_0s_1s_and_2s cl=new sort_an_array_of_0s_1s_and_2s();
        cl.sortColors(arr);
    }   
}