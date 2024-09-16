import java.util.*;
public class a_02printKPC{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printKPC(str,"");
    }

    static String [] cmap = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str, String ans){

        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        String istr = cmap[ch-'0'];

        for(int i=0;i<istr.length();i++){
            printKPC(ros,ans+istr.charAt(i));
        }

    }
    
}