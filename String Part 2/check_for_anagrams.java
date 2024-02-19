/*
Accepted
*/
import java.util.HashMap;
import java.util.Scanner;
class check_for_anagrams{
    public boolean isAnagram(String s, String t) {
        int c=0;
        boolean flag=false;
        HashMap<Character, Integer> hs=new HashMap<>();
        HashMap<Character, Integer> ht=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i), hs.get(s.charAt(i))+1);
            }
            else{
                hs.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(ht.containsKey(t.charAt(i))){
                ht.put(t.charAt(i), ht.get(t.charAt(i))+1);
            }
            else{
                ht.put(t.charAt(i), 1);
            }
        }
        if(hs.size()==ht.size()){
            for(Character comp: hs.keySet()){
                if(ht.containsKey(comp) && ht.get(comp)==hs.get(comp)){
                    c++;
                }
                else{
                    flag=false;
                }
            }
            if(c==ht.size()){
                flag=true;
            }
        }
        else{
            flag=false;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        check_for_anagrams cl=new check_for_anagrams();
        boolean resp= cl.isAnagram(s, t);
        System.out.println(resp);
    }
}