import java.util.*;

public class a_02displayarrayrev {
     public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int[5];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        displayArr(arr,0);
    }

    public static void displayArr(int[] arr,int idx){
        
        if(idx ==arr.length){
            return;
        }

        
        displayArr(arr,idx+1);
        System.out.println(arr[idx]);

    }
}
