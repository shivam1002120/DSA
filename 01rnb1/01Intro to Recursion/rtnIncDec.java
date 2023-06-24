import java.util.*;

public class rtnIncDec {
    public static void main(String[]args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        printIncDec(n);
    }

    public static void printIncDec(int n){
        if(n==0){
            System.out.println(0);
            return;
        }

        System.out.println(n);
        printIncDec(n-1);
        System.out.println(n);

    }
}
