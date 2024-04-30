import java.util.*;

public class EvenGame{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int i = 1;
        while(i <= num){
            if( i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}