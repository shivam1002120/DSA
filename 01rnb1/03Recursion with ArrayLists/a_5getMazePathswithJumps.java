import java.util.*;

public class a_5getMazePathswithJumps {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> pwj  = getMazePaths(0,0,n-1,m-1);
        System.out.println(pwj);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sr==dr&&sc==dc){

            ArrayList<String> ip = new ArrayList<>();
            ip.add("");

            return ip;

        }

        if(sr>dr || sc>dc){
            ArrayList<String> ip = new ArrayList<>();

            return ip;
        }

        ArrayList<String>paths = new ArrayList<>();

        //Horizontal moves:
        for(int m = 1;m<=dc-sc;m++){
            ArrayList<String> ph = getMazePaths(sr,sc+m,dr,dc);

            for(String path:ph){
             paths.add("h"+m+path);
            }

        }

         //Vertical moves:
        for(int m = 1;m<=dr-sr;m++){
            ArrayList<String> pv = getMazePaths(sr+m,sc,dr,dc);
            for(String path:pv){
             paths.add("v"+m+path);
            }
        }

         //Diagonal moves:
        for(int m = 1;m<=dc-sc&&m<=dr-sr;m++){
            ArrayList<String> pd = getMazePaths(sr+m,sc+m,dr,dc);
            for(String path:pd){
             paths.add("d"+m+path);
            }
        }
       

        return paths;
    }

}
