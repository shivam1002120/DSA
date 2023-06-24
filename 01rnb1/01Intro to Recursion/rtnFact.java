import java.util.*;

public class rtnFact {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int factOfN = factorial(n);
        System.out.println(factOfN);
    }

    public static int factorial(int n){

        if(n==0||n==1){
            return 1;
        }

        int fonm1 = factorial(n-1);
        return n*fonm1;
    }

}