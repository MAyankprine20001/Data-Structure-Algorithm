import java.util.*;

public class VowerlOrNot{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}