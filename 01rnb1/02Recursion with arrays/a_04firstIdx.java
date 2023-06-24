import java.util.*;

public class a_04firstIdx {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scn.nextInt();
        }

        int k = scn.nextInt();
        int firstIdx = firstIndex(arr,0,k);
        System.out.println(firstIdx);

    }

    public static int firstIndex(int [] arr, int idx, int k){
        if(idx == arr.length){
            return -1;
        }

        int fidx = firstIndex(arr,idx+1,k);

        if(arr[idx] == k){
            return idx;
        }

        return fidx;
    }
}
