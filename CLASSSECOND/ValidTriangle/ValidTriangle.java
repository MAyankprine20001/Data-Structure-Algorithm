import java.util.*;

public class ValidTriangle{

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();

        if(A + B + C == 180){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}