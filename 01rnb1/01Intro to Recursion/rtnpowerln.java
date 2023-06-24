import java.util.*;

public class rtnpowerln {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int powerxn = power(x,n);

        System.out.println(powerxn);
    }

    public static int power(int x, int n){
        if(n ==0){
            return 1;
        }
        int powerxnm1 = power(x,n-1);
        return powerxnm1*x;
    }
}
