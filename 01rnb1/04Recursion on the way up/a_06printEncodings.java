import java.util.*;

public class a_06printEncodings {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        printEncodings(str,"");
    }

    public static void printEncodings (String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        else if(str.length()==1){
            if(str.charAt(0)=='0'){
                return;
            }
            
            else{
                String ch0 = str.charAt(0)+"";
                String code0 = (char)('a'+(Integer.parseInt(ch0)-1))+"";

                printEncodings("",ans+code0);
            }

        }
        else{
            if(str.charAt(0)=='0'){
                return;
            }
            else{
                String ch0 = str.charAt(0)+"";
                String ros0 = str.substring(1);
                String code0 = (char)('a'+(Integer.parseInt(ch0)-1))+"";

                printEncodings(ros0,ans+code0);


                String ch01 = str.substring(0,2);
                String ros01 = str.substring(2);
                String code01 = (char)('a'+(Integer.parseInt(ch01)-1))+"";

                if(Integer.parseInt(ch01)<=26){
                    printEncodings(ros01, ans+code01);
                }
            }

        }




    }
}