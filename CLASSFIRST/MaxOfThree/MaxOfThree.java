import java.util.*;

public class MaxOfThree{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A > B && A > C){
            System.out.println(A);
        }else if(B > C && B > A){
            System.out.println(B);
        }else{
            System.out.print(C);
        }
    }
}