/*
Accepted
*/
public class max_consecutive_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ml=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                if(i==nums.length-1){
                    if(c>ml){
                        ml=c;
                        c=0;
                    }
                }
            }
            else if(nums[i]!=1){
                if(c>ml){
                    ml=c;
                }
                c=0;
            }
        }
        return ml;
    }
    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1};
        max_consecutive_ones obj=new max_consecutive_ones();
        int resp=obj.findMaxConsecutiveOnes(nums);
        System.out.println(resp);
    }
}