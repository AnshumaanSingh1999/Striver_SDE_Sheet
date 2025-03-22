/*
Accepted
*/
import java.util.Scanner;
public class z_function {
    public int strStr(String haystack, String needle) {
        int occurrence=haystack.indexOf(needle);
        return occurrence;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String haystack=sc.nextLine();
        String needle=sc.nextLine();
        z_function zf=new z_function();
        int occurrence=zf.strStr(haystack, needle);
        System.out.println(occurrence);       
    }
}
