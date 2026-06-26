import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to our Calculator:");
//        System.out.println("enter your first number:");
//        int firstNumber = input.nextInt();
//        System.out.println("enter your second number:");
//        int secondNumber = input.nextInt();
//        int sum = firstNumber + secondNumber;
//        System.out.println("The sum of two number: " + sum);

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the sum of two number:");
        System.out.println("Please enter your first number");
        int firstNumber = input.nextInt();
        System.out.println("Now enter your second number:");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Your sum is " +sum);
    }
}
