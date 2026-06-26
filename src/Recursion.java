import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial number:");
        System.out.println("Please, enter your number:");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Your factorial number is " + fact);
    }
    public static long factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
}
