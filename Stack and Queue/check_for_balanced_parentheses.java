/*
Accepted
*/
import java.util.*;
public class check_for_balanced_parentheses {
    public boolean isValid(String s) {
        boolean flag=false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.empty()){
                if(ch=='{' || ch=='(' || ch=='[' || ch==']' || ch=='}' || ch==')'){
                    st.push(ch);
                }
            }
            else if(st.empty()==false){
                if(ch=='}' && st.peek()=='{' || ch==']' && st.peek()=='[' || ch==')' && st.peek()=='('){
                    st.pop();
                }
                else{
                    if(ch=='{' || ch=='(' || ch=='[' || ch==']' || ch=='}' || ch==')'){
                        st.push(ch);
                    }
                }
            }
        }
        if(st.empty()){
            flag=true;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        check_for_balanced_parentheses cl=new check_for_balanced_parentheses();
        boolean resp=cl.isValid(s);
        System.out.println(resp);
    }
}