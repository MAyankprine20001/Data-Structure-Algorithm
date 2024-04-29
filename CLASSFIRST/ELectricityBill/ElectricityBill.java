import java.util.*;

public class ElectricityBill{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Units");
        int n = sc.nextInt();
        double totalBill = 0.0; // new learning
        if (n <= 50) {
            totalBill += (n * 0.50); // integer and float number is save ke liya double ki jaroot thi
            System.out.println("total boll " + totalBill);
        } else if (n > 50 && n <= 150) {
            totalBill += (50 * 0.50) + ((n - 50) * 0.75);
        } else if (n > 150 && n <= 250) {
            totalBill += (50 * 0.50) + (100 * 0.75) + ((n - 150) * 1.20);
        } else {
            totalBill += (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((n - 250) * 1.50);
        }

        
        totalBill += totalBill * 0.20;
        int finalBill = (int)Math.floor(totalBill);
        System.out.println(finalBill);

    }
}