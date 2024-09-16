import java.util.*;
public class a_01printSubsequence{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

         printSubsequences(str,"");
    }
    public static void printSubsequences(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        else{
            char ch  = str.charAt(0);
            String rs = str.substring(1);
            
            printSubsequences(rs,ans+ch);
            printSubsequences(rs,ans);
        }
    }
    
}