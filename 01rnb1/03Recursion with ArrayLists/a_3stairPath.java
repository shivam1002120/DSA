import java.util.*;

public class a_3stairPath{
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    ArrayList<String> sp = getStairPaths(n);

    System.out.println(sp);

}
    public static ArrayList<String> getStairPaths(int n) {
        if(n<0){
            return new ArrayList<>();
        }
        if(n==0){
            ArrayList<String> path = new ArrayList<>();
            path.add("");
            return path;
        }

        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String>path2 = getStairPaths(n-2);
        ArrayList<String>path3 = getStairPaths(n-3);

        ArrayList<String> pathn = new ArrayList<>();

        for(String s:path1){
            pathn.add("1"+s);
        }
        
        for(String s:path2){
            pathn.add("2"+s);
        }

        for(String s:path3){
            pathn.add("3"+s);
        }

        return pathn;
    }

}