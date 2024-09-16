import java.util.*;
public class a_03IsPrime {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();
        
        for(int i=1;i<=t;i++){
            int num = scn.nextInt();

            int div = 2;
            while(div*div<=num){
                if(num%div==0){
                    break;
                }
                div++;
            }

            if(div*div>num){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }

    }
}
