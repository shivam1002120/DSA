///find the span of array, BY SPAN WE MEAN  THE DIFFERENCE BETWEEN THE LARGEST AND THE SMALLEST VALUE.
import java.util.*;

public class a01_spanOfArrays {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max-min);


    }
}
