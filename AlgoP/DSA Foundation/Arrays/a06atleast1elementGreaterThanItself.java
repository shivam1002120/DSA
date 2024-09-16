/*
Given N array find the total no. of elements having atleast 1 element greater than itself.
for eg:
{-4, -3, 7, 9, 3, 9, 4}

Hint: count number other than max of array, for eg in above array count no.s other than 9.
*/

import java.util.*;
public class a06atleast1elementGreaterThanItself {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);

        int  n = scn.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        int count =0;

        for(int i=0;i<n;i++){
            if(arr[i]==max){
                count++;
            }
        }

        System.out.println(n-count);

    }
}
