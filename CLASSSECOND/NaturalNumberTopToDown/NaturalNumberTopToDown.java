import java.util.*;

public class NaturalNumberTopToDown{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
         while( num != 0){
            System.out.print(num + " ");
            num--;
         }
    }
}