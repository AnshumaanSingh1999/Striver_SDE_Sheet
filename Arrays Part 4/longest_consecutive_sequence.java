/*
Partially Accepted
*/
import java.util.*;
class longest_consecutive_sequence {
    public int longestConsecutive(int[] nums) {
        int ml=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:nums){
            al.add(i);
        }
        for(int i=0;i<nums.length;i++){
            int l=0;
            while(al.contains(nums[i]+1)){
                nums[i]++;
                l++;                
            }
            l=l+1;
            if(l>ml){
                ml=l;
            }
        }
        return ml;
    }
    public static void main(String[] args) {
        int nums[] = {0,3,7,2,5,8,4,6,0,1};
        longest_consecutive_sequence obj=new longest_consecutive_sequence();
        int resp=obj.longestConsecutive(nums);
        System.out.println(resp);
    }
}