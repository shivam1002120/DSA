// Find Element in an array, if it is present print index and it's ot present then print -1;

import java.util.*;
public class a02_FindElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr [] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int num = scn.nextInt();
        int idx =-1;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                idx = i;
                break;
            }
        }

        System.out.println(idx);
    }
}
