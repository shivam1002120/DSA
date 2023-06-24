import java.util.*;

public class a_05lastIdx {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scn.nextInt();
        }

        int k = scn.nextInt();
        int lastIdx = lastIndex(arr,arr.length-1,k);
        System.out.println(lastIdx);

    }

    public static int lastIndex(int [] arr, int idx, int k){
        if(idx ==-1){
            return -1;
        }
        int iidx = lastIndex(arr,idx-1,k);
        if(arr[idx]==k){
            return idx;
        }
        return iidx;
    }
}
