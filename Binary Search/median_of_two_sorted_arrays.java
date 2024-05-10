/* 
Accepted 
*/
import java.util.*;
class median_of_two_sorted_arrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double r=0;
        int ir=0;
        int ir2=0;
        int l=nums1.length+nums2.length;
        int a[]=new int[l];
        int z=0;
        double s=0;
        while(z<l){
            if(nums1.length>0){
                for(int i=0;i<nums1.length;i++){
                    a[z]=nums1[i];
                    z++;
                }
            }
            if(nums2.length>0){
                for(int i=0;i<nums2.length;i++){
                    a[z]=nums2[i];
                    z++;
                }
            } 
        }
        Arrays.sort(a);
        if(l%2!=0){
            if(l==1){
                ir=0;
                r=a[ir];
            }
            else{
                ir=l/2;
                r=a[ir];
            }
            
        }
        else if(l%2==0){
            ir=l/2;
            ir2=l/2-1;
            s=a[ir]+a[ir2];
            r=s/2;
        }
        return r;
    }
    public static void main(String[] args) {
        int nums1[] = {1,3}; 
        int nums2[] = {2};
        median_of_two_sorted_arrays obj=new median_of_two_sorted_arrays();
        double resp=obj.findMedianSortedArrays(nums1, nums2);
        System.out.println(resp);;
    }
}