import java.util.*;
public class a_04printMazePath{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        printMazePaths(0,0,n-1,m-1,"");

    }
    public static void printMazePaths(int sr, int sc, int dr, int dc, String path){
        if(sr>dr||sc>dc){
            return;
        }
        
        if(sr==dr&&sc==dc){
            System.out.println(path);
            return;
        }

        //horizontal move :
        printMazePaths(sr, sc+1,  dr,  dc,  path+"h");

        //vertical move :
        printMazePaths(sr+1, sc,  dr,  dc,  path+"v");

    }
    
}