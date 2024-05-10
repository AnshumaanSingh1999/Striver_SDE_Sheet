/*
Accepted
*/
import java.util.*;
class K_th_largest_element_in_an_array {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int l=nums.length;
        int resp=nums[l-k];
        return resp;
    }
    public static void main(String[] args) {
        int nums[]={3,2,1,5,6,4};
        int k = 2;
        K_th_largest_element_in_an_array obj=new K_th_largest_element_in_an_array();
        int resp=obj.findKthLargest(nums, k);
        System.out.println(resp);
    }
}