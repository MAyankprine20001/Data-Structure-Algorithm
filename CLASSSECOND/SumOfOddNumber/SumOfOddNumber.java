import java.util.*;

public class SumOfOddNumber{
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    // if num is negative
    if(num < 0){
        num = -num;
    }
    int i = 1;
    int sum = 0;
    while(i <= num){
        if(i % 2 != 0){
          sum += i;   
        }
        i++;
    }
    System.out.println(sum);
}
}