/*Question:
https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/pep-java-1gettingstarted-1isprime
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class qp02 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        
        System.out.println("Prime");
        
    }
}