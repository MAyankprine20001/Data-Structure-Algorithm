import java.util.*;

public class MinOfTwo{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();

        if(A < B){
            System.out.println(A);
        }else{
            System.out.println(B);
        }
    }
}