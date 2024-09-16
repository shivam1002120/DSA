import java.util.*;

public class a_13CuriousBenjaminBulbs {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        // Only perfect sqares less than the n will be left on.
        for(int i=1;i<=n/2-1;i++){
            if(i*i<=n){
                System.out.println(i*i);
            }
        }
        
    }
}
