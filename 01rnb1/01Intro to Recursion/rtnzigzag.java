import java.util.*;

public class rtnzigzag {

    public static void main(String[] args) throws Exception {
        
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printZigZag(n);

    }

    public static void printZigZag(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        printZigZag(n-1);
        System.out.print(n+" ");
        printZigZag(n-1);
        System.out.print(n+" ");

    }

}