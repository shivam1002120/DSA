import java.util.*;

public class rtntowerHanoi {

    public static void main(String[] args) throws Exception {

       // write your code here
       Scanner scn = new Scanner(System.in);

       int n = scn.nextInt();

       int t1id = scn.nextInt();
       int t2id = scn.nextInt();
       int t3id = scn.nextInt();

       toh(n,t1id,t2id,t3id);

    }

    public static void toh(int t, int t1id, int t2id, int t3id){
        if(t==1){
        System.out.println(t+"["+t1id+" -> "+t2id+"]");
            return;
        }
        
        toh(t-1,t1id,t3id,t2id);
        System.out.println(t+"["+t1id+" -> "+t2id+"]");
        toh(t-1,t3id,t2id,t1id);
        
    }

}