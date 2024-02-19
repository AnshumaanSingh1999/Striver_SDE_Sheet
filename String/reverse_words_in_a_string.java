/*
Accepted
*/
import java.util.Scanner;
class reverse_words_in_a_string{
    public String reverseWords(String s) {
        String resp="";
        String a[]=s.split(" ");        
        for(int i=a.length-1;i>=0;i--){
            if(a[i].isEmpty()){
                continue;
            }
            else{
                resp=resp+a[i]+" ";
            }            
        }
        return resp.trim();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        reverse_words_in_a_string rw=new reverse_words_in_a_string();
        String r=rw.reverseWords(s);
        System.out.println(r);
    }
}