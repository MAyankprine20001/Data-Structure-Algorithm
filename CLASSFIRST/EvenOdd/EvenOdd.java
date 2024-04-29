import java.util.*;

public class EvenOdd{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if(num % 2 == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}