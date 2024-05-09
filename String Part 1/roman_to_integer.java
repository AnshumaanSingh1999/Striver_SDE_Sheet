/*
Accepted
*/
import java.util.Scanner;
public class roman_to_integer {
    public int romanToInt(String s) {
        char ch;
        char nch;
        int sum=0;
        int i=0;
        while(i<s.length()){
            ch=s.charAt(i);
            
            if(i==s.length()-1){
                if(ch=='I'){
                    sum=sum+1;
                    i++;

                }
                else if(ch=='V'){
                    sum=sum+5;
                    i++;
                }
                else if(ch=='X'){
                    sum=sum+10;
                    i++;
                }
                else if(ch=='L'){
                    sum=sum+50;
                    i++;
                }
                else if(ch=='C'){
                    sum=sum+100;
                    i++;
                }
                else if(ch=='D'){
                    sum=sum+500;
                    i++;
                }
                else if(ch=='M'){
                    sum=sum+1000;
                    i++;
                }
            }

            else if(i<s.length()-1){
                nch=s.charAt(i+1);

                if(ch=='I' && nch=='V'){
                    sum=sum+4;
                    i=i+2;
                }
                else if(ch=='I' && nch=='X')
                {
                    sum=sum+9;
                    i=i+2;
                }
                else if(ch=='X' && nch=='L')
                {
                    sum=sum+40;
                    i=i+2;
                }
                else if(ch=='X' && nch=='C')
                {
                    sum=sum+90;
                    i=i+2;
                }
                else if(ch=='C' && nch=='D')
                {
                    sum=sum+400;
                    i=i+2;
                }
                else if(ch=='C' && nch=='M')
                {
                    sum=sum+900;
                    i=i+2;
                }

                else if(ch=='I'){
                    sum=sum+1;
                    i++;
                }
                else if(ch=='V'){
                    sum=sum+5;
                    i++;
                }
                else if(ch=='X'){
                    sum=sum+10;
                    i++;
                }
                else if(ch=='L'){
                    sum=sum+50;
                    i++;
                }
                else if(ch=='C'){
                    sum=sum+100;
                    i++;
                }
                else if(ch=='D'){
                    sum=sum+500;
                    i++;
                }
                else if(ch=='M'){
                    sum=sum+1000;
                    i++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        roman_to_integer obj=new roman_to_integer();
        int resp=obj.romanToInt(s);
        System.out.println(resp);
    }
}