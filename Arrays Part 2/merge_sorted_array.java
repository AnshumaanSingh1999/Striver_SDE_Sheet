/*
Accepted
*/
import java.util.*;
public class merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=m;
        if(n!=0){
            for(int i=0;i<n;i++){
                nums1[x]=nums2[i];
                x++;
            }
        }
        Arrays.sort(nums1);
        // for(int t:nums1){
        //     System.out.println(t);
        // }
    }
    public static void main(String[] args) {
        int nums1[]= {1,2,3,0,0,0};
        int m = 3;
        int nums2[]= {2,5,6};
        int n = 3;
        merge_sorted_array obj=new merge_sorted_array();
        obj.merge(nums1, m, nums2, n);
    }
}