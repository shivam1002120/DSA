import java.util.*;

public class a_03maxArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int[5];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int max = maxArr(arr,0);
        System.out.println(max);
    }

    public static int maxArr(int [] arr, int idx){
        if(idx ==arr.length-1){
            return arr[arr.length-1];
        }

        int maxi = maxArr(arr,idx+1);
        
        if(arr[idx]>maxi){
            return arr[idx];
        }
        return maxi;

    }
}
