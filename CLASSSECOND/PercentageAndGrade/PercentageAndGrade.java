import java.util.*;

public class PercentageAndGrade{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int sub1= sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int getMarksTotal = sub1 + sub2 + sub3 + sub4 + sub5 ;


        int percentage =(getMarksTotal*100)/500;

        if(percentage >= 90){
          System.out.print(percentage + "\n" + 'A');
        }else if(percentage >=80 && percentage < 90){
         System.out.print(percentage + "\n" + 'B');
        }else if(percentage >=70 && percentage < 80){
         System.out.print(percentage + "\n" + 'C');
        }else if(percentage >=60 && percentage < 70){
         System.out.print(percentage + "\n" + 'D');
        }else if(percentage >=40){
         System.out.print(percentage + "\n" + 'E');
        }else{
         System.out.print(percentage + "\n" + 'F');

        }

        
    }
}