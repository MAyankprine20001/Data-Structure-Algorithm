import java.util.*;

public class DaysInMonth{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int month = scn.nextInt();
        
        if(month == 1){
            System.out.println(31);
        }else if(month == 2){
            System.out.println(28);
        }else if(month == 3){
            System.out.println(31);
        }else if(month == 4){
            System.out.println(30);
        }else if(month == 5){
            System.out.println(31);
        }else if(month == 6){
            System.out.println(30);
        }else if(month == 7){
            System.out.println(31);
        }else if(month == 8){
            System.out.println(31);
        }else if(month == 9){
            System.out.println(30);
        }else if(month == 10){
            System.out.println(31);
        }else if(month == 11){
            System.out.println(30);
        }else if(month == 12){
            System.out.println(31);
        }else{
            System.out.println("Invalid Month");
        }
        
    }
}