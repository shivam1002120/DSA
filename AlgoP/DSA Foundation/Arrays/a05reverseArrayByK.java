import java.util.*;
public class a05reverseArrayByK{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int k = scn.nextInt();

        k = k<0? Math.abs(k):k;
        k = k>n? k%n : k;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[], int i, int j){

        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }

    }
}