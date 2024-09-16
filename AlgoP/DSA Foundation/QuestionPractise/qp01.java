/*Question:
https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/pep-java-1gettingstarted-3reversenumber/problem
*/
import java.io.*;
import java.util.*;

public class qp01 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int num = n;
        String nod = "";
        while(num>0){
            int dig = num%10;
            
            num=num/10;
            nod+=dig;
        }
        System.out.println(Integer.parseInt(nod));
        
    }
}