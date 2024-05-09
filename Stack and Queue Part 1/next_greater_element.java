/*
Accepted
*/
import java.util.*;
class next_greater_element{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l=nums1.length;
        int r[]=new int[l];
        int z=0;
        for(int i=0;i<l;i++){
            for(int j=0;j<nums2.length;j++){
                int x=0;
                int m=-1;
                if(nums1[i]==nums2[j]){
                    x=j+1;
                    while(x<nums2.length){
                        if(nums2[x]>nums2[j]){
                            m=nums2[x];
                            break;
                        }
                        x++;
                    }
                    r[z]=m;
                    z++;
                }
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int nums1[]=new int[m];
        int nums2[]=new int[n];
        for(int i=0;i<m;i++){
            nums1[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            nums2[j]=sc.nextInt();
        }
        next_greater_element obj=new next_greater_element();
        try{
        int resp[]=obj.nextGreaterElement(nums1, nums2);
        for(int i:resp){
            System.out.println(i);
        }
        }
        catch(Exception e){
            System.out.println("Some issue");
        }
    }
}