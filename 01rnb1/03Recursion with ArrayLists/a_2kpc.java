import java.util.*;

public class a_2kpc {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        ArrayList<String> kpc = getKPC(str);

        System.out.println(kpc);

    }

    static String [] ksv = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str){

        if(str.length()==0){
            ArrayList<String> ial =  new ArrayList<String>();
            ial.add("");
            return ial;
        }

        char ch = str.charAt(0);

        ArrayList<String> rAL = getKPC(str.substring(1));

        ArrayList<String> ikpc = new ArrayList<>();

        String kpCode = ksv[ch-'0'];

        for(int i=0;i<kpCode.length();i++){
            char ch01 = kpCode.charAt(i);
            for(String s:rAL){
                ikpc.add(s+ch0);
            }
        }

    }

}
