/*
Accepted
*/
class longest_substring_without_repeat{
    public int lengthOfLongestSubstring(String s) {
        int c=Integer.MIN_VALUE;
        int l=s.length();
        String cs="";
        if(l==1){
            c=1;
        }
        else if(l<1){
            c=0;
        }
        else if(l>1){
            for(int i=0;i<l;i++){
                int j=i;
                String r="";
                while(j<l){
                    char ch=s.charAt(j);
                    if(r.indexOf(ch)==-1){
                        r=r+ch;
                        j++;
                    }
                    else if(r.indexOf(ch)!=-1){
                        break;
                    }
                }
                if(r.length()>c){
                    c=r.length();
                    // cs=r;
                }   
            }   
        }
        // System.out.println(cs);
        return c;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        longest_substring_without_repeat obj=new longest_substring_without_repeat();
        int resp=obj.lengthOfLongestSubstring(s);
        System.out.println(resp);
    }
}