import java.util.*;
public class TernaryOperator {
    // by simple way
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to fined greatest number:");
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
        int greatestNumber = num1 > num2 ? num1: num2;
//        if(num1 > num2){
//            int greatestNumber = num1;
//
//        }else{
//            int greatestNumber = num2;
            System.out.println(greatestNumber + " is the greatest number:");
//        }
    }
}
