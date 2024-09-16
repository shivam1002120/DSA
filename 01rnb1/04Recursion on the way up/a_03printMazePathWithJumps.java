import java.util.*;
public class a_03printMazePathWithJumps{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        printMazePathWithJump(0,0,n-1,m-1,"");

    }
    public static void printMazePathWithJump(int sr, int sc, int dr, int dc, String path){
        if(sr>dr||sc>dc){
            return;
        }
        
        if(sr==dr&&sc==dc){
            System.out.println(path);
            return;
        }

        //horizontal move :
        for(int i=1;i<=dc-sc;i++){
        printMazePathWithJump(sr, sc+i,  dr,  dc,  path+"h"+i);
        }

        //vertical move :
        for(int i=1;i<=dr-sr;i++){
        printMazePathWithJump(sr+i, sc,  dr,  dc,  path+"v"+i);
        }
       
        //diagonalMove :
        for(int i=1;i<=dr-sr&&i<=dr-sr;i++){
        printMazePathWithJump(sr+i, sc+i,  dr,  dc,  path+"d"+i);
        }
        

    }
    
}