import java.util.*;

public class a_4getMazePaths {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> mp =     getMazePaths(0,0,n-1,m-1);
        System.out.println(mp);
    }
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr>dr||sc>dc){
            ArrayList<String> ip = new ArrayList<>();
            return ip;
        }

        if(sr==dr && sc==dc){
            ArrayList<String> ip = new ArrayList<>();
            ip.add("");
            return ip;
        }
        
        ArrayList<String> hpaths = getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> vpaths = getMazePaths(sr+1,sc,dr,dc);

        ArrayList<String> paths = new ArrayList<String>();

        for(String path:hpaths){
            paths.add("h"+path);
        }

        for(String path:vpaths){
            paths.add("v"+path);
        }

        return paths;

    }
}
