import java.util.*;
public class a01_fibonacci{
    public static void main (String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nfibonacci = fibo(n);

        System.out.println(nfibonacci);
    }

    public static int fibo(int num){
        if(num==0||num==1){
            return num;
        }

        int nm1 = fibo(num-1);
        int nm2 = fibo(num-2);

        return nm1+nm2;
    }
}