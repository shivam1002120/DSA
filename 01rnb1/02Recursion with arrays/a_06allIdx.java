import java.util.*;

public class a_06allIdx {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scn.nextInt();
        }

        int k = scn.nextInt();
        int [] idxArr = allIndices(arr,k,0,0);

        if(idxArr.length>0){
            for(int i=0;i<idxArr.length;i++){
                System.out.println(idxArr[i]);
            }
        }
        else{
            System.out.println(-1);
        }
        

    }

    public static int[] allIndices(int [] arr, int k, int idx, int fsf){
        if(idx ==arr.length){
            int[] idxarr = new int[fsf];
            return idxarr;
        }

        int[] iidx;

        if(arr[idx]==k){
             iidx = allIndices(arr,k,idx+1,fsf+1);
            iidx[fsf] = idx;
            
        }
        else{
            iidx = allIndices(arr,k,idx+1,fsf);
            
        }
        return iidx;
        
       
    }
}
