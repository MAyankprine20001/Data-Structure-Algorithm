import java.util.*;

public class BankAccount{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int BankBalance = sc.nextInt();
        int typeOperation = sc.nextInt();
        int amount = sc.nextInt();

        if(typeOperation == 1){
            System.out.println(BankBalance + amount);
        }else if(typeOperation == 2){
            if(BankBalance > amount ){
                System.out.println(BankBalance - amount);
            }else{
                System.out.println("Insufficient Funds");
            }
        }else {
            System.out.print("Invalid Operation");
        }
    }

    
}