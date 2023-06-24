import java.util.*;

public class rtnpowerlog {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int powerlogxn = power(x,n);

        System.out.println(powerlogxn);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }

        int powerxnb2 = power(x,n/2);
        if(n%2==1){
            return powerxnb2*powerxnb2*x;
        }

        return powerxnb2*powerxnb2;
    }

}