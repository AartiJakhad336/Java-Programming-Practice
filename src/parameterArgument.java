//import java.util.Scanner;
//
//public class parameterArgument {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number:");
//        int num = input.nextInt();
//        int i = 1;
//        while(i <= 10){
//            System.out.println(num*i);
//            i++;
//        }
//    }
//
//}

//import java.util.Scanner;
//
//public class parameterArgument {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to Multiplication World\n");
//        System.out.println("Enter your number");
//        int number = scanner.nextInt();
//        printMultiplicationTable(number);
//    }
//    public static void printMultiplicationTable(int number){
//        int i = 1;
//        while(i <= 10){
//            System.out.println(number + "X" + i + "=" + (number*i));
//            i++;
//        }
//    }
//}

//import java.util.Scanner;
//
//public class parameterArgument {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to the sum of all odd number");
//        System.out.println("Enter your number");
//        int num = scanner.nextInt();
//        sumOddNumber(num);
//
//
//
//    }
//    public static void sumOddNumber(int num){
//        int sum = 0;
//        int i= 1;
//        while(i <= num){
//            sum += i;
//            i +=2;
//        }
//        System.out.println(sum);
//    }
//}

//import java.util.Scanner;
//
//public class parameterArgument {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to the sum of all odd number");
//        System.out.println("Enter your number");
//        int num = scanner.nextInt();
//        int sum = oddSum(num);
//        System.out.println(sum);
//    }
//
//    public static int oddSum(int num){
//        int sum = 0;
//        int i = 1;
//        while(i<= num){
//            sum += i;
//            i+=2;
//        }
//        return sum;
//    }
//}

//import java.util.Scanner;
//
//public class parameterArgument {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to factorial:");
//        System.out.println("Enter your number:");
//        int num = input.nextInt();
//        long fact = factorial(num);
//        System.out.println("Factorial is:" + fact);
//
//    }
//
//    public static long factorial(int num){
//        if (num<2){
//            return 1;
//        }
//        long fact = 1;
//        int i = 2;
//        while(i<=num){
//          fact *= i;
//          i++;
//        }
//        return fact;
//    }
//}

//import java.util.Scanner;
//
//public class parameterArgument {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to the sum of digit:");
//        System.out.println("Enter the number:");
//        int num = input.nextInt();
//        int sum = sumOfDigits(num);
//        System.out.println("The sum of digits of integer:" +sum);
//
//    }
//    public static int sumOfDigits(int num){
//        int sum = 0;
//        while(num>0){
//            sum += num % 10;
//            num /= 10;
//
//        }
//        return sum;
//    }
//}

//import java.util.Scanner;
//
//public class parameterArgument{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to the lcm of number");
//        System.out.println("Enter your first number:");
//        int first = input.nextInt();
//        System.out.println("Enter your second number:");
//        int second = input.nextInt();
//        int lcm = lcm(first, second);
//        System.out.println("The lcm of :" + lcm);
//
//    }
//    public static int lcm(int first, int second){
//        int i = 1;
//        while(i <= second){  // while(true)
//            int factor = first * i;
//            if(factor % second == 0){
//                return factor;
//            }
//            i++;
//        }
//
//        return 0;   //unrechable20
//    }
//}

//import java.util.Scanner;
//
//public class parameterArgument {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to the GCD:");
//        System.out.println("Enter your first number;");
//        int first = input.nextInt();
//        System.out.println("Enter your second number:");
//        int second = input.nextInt();
//        int gcd = gcd(first, second);
//        System.out.println("GCD of the number is:" + gcd);
//
//    }
//    public static int gcd(int num1, int num2){
//        int gcd = 1;
//        int i = 2;
//        int least = least(num1, num2);
//        while(i<=least){
//            if(num1 % i == 0 && num2 % i == 0) {
//                gcd = i;
//            }
//            i++;
//        }
//        return gcd;
//    }
//    public static int least(int num1, int num2){
//        if(num1< num2){
//            return num1;
//
//        }else{
//            return num2;
//        }
//    }
//}

//import java.util.Scanner;
//
//public class parameterArgument {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to the prime number:");
//        System.out.println("Enter you number:");
//        int num = input.nextInt();
//        boolean prime = prime(num);
//        if (prime){
//            System.out.println("Your number is prime:");
//        }else{
//            System.out.println("your number is not prime:");
//        }
//
//
//    }
//    public static boolean prime(int num){
//        int i = 2;
//        while (i<num){
//            if (num% i == 0){
//                return false;
//            }
//            i++;
//        }
//        return true;
//
//    }
//}

//import java.util.Scanner;
//
//public class parameterArgument{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to the reverse the digits of number:");
//        System.out.println("Enter your digits:");
//        int num = input.nextInt();
//        int reverse = reverseNumber(num);
//        System.out.println("The reverse num:" + reverse);
//
//    }
//    public static int reverseNumber(int num){
//        int newNum = 0;
//        while (num > 0) {
//
//            newNum = (newNum * 10) + (num % 10) ;
//            num /= 10;
//        }
//        return newNum;
//    }
//
//}

//import java.util.Scanner;
//
//public class parameterArgument{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to fibonacci series:");
//        System.out.println("Enter you number:");
//        int num = input.nextInt();
//        System.out.println("The Fibonacci series:" + num);
//        fibonacci(num);
//
//
//
//    }
//    public static void fibonacci(int num){
//        if (num < 0) return;
//        System.out.print("0 ");
//        if (num == 0)  return;
//        System.out.print("1 ");
//
//        int first = 0, second = 1;
//        while(first + second <= num){
//            int third = first + second;
//            System.out.print(third + " ");
//            first = second;
//            second = third;
//        }
//

public class parameterArgument{

}

































