import java.util.*;

public class ProfitAndLoss{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int costPrice = scn.nextInt();
        int sellingPrice = scn.nextInt();

        if(sellingPrice > costPrice){
            int profit = sellingPrice - costPrice;
            System.out.println(1 + " " + profit);
        }else{
            int loss = costPrice - sellingPrice;
            System.out.println(-1 + " " + loss);
        }
    }
}