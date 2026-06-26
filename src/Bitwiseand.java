//import java.util.Scanner;
//
//public class Bitwiseand {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Showcashing Bitwise And operator\n");
//        System.out.println("Enter the first number:");
//        int first = input.nextInt();
//        System.out.println("Enter the second number:");
//        int second = input.nextInt();
//
//        int result = first & second;
//        System.out.println("Result is" + result);
//    }
//}

import java.util.Scanner;

public class Bitwiseand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check the number:\n");
        System.out.println("Enter the first number:");
        int first = input.nextInt();
        System.out.println("Enter the second number:");
        int second = input.nextInt();
        int result = first & second;
        System.out.println("The result:" + result);
        if (result % 2 ==0){
            System.out.println("The given number is even:");

        }else{
            System.out.println("The given number is odd:");
        }
    }
//        System.out.println("Enter your number:");
//        int num = input.nextInt();
//
//        if ((num & 1) == 1) {
//            System.out.println("Your number is odd:");
//
//        } else {
//            System.out.println("Your number is even:");
//        }

//        System.out.println("Enter the number:");
//        int num = input.nextInt();
//
//        if ((num & 1) == 1){
//            System.out.println("The given number is odd");
//        }else {
//            System.out.println("The given number is even");
//        }

        
//    }
}









