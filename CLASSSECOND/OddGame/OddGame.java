import java.util.*;

public class OddGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while(i <= n){
            if(i % 2 != 0){
                System.out.print(i + " ");

            }
            i++;
        }
    }
}