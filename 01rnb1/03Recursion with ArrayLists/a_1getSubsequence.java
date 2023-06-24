import java.util.*;
public class a_1getSubsequence{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> ss = gss(str);
        System.out.println(ss);
    }

    public static ArrayList<String> gss(String str) {
    if(str.length()==0){
        ArrayList<String> iarr = new ArrayList<>();
        iarr.add("");
        return iarr;
    }    

        char ch = str.charAt(0);
        ArrayList<String> ssi = gss(str.substring(1));

        ArrayList<String> issal = new ArrayList<>();

        for(String s:ssi){
            issal.add(s); 
        }

        for(String s:ssi){
            issal.add(ch+s); 
        }

        return issal;

    }
}