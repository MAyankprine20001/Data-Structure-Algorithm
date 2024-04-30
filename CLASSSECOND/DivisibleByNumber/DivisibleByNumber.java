import java.util.*;

public class DivisibleByNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 11 == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}