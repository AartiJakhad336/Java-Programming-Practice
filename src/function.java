import java.util.Scanner;
//public class function {
//    public static void main(String[] args) {
//        System.out.println("In main method:");
//        greetUser();
//        System.out.println("Method calling complete:");
//        greetUser();
//
//    }
//
//    public static void greetUser(){
//        System.out.println("Good morning from KG coding:");
//    }
//}
//        printfirstpattern();
//        printsecondpattern();
//        printsecondpattern();
//        printthirdpattern();
//    }
//
//    public static void printfirstpattern(){
//        int rows = 0;
//        while(rows <5){
//            System.out.print("*");
//            int i = 0;
//            while (i<rows){
//                System.out.print(" *");
//                i++;
//            }
//            System.out.println();
//            rows++;
//        }
//    }
//
//    public static void printsecondpattern() {
//        System.out.println("*****");
//        System.out.println("****");
//        System.out.println("***");
//        System.out.println("**");
//        System.out.println("*\n\n");
//
//    }
//
//    public static void printthirdpattern(){
//        System.out.println("    *");
//        System.out.println("   **");
//        System.out.println("  ***");
//        System.out.println(" ****");
//        System.out.println("*****");
//
//    }
//
//    }

//create a code with the help of function



//public class function {
//    public static void main(String[] args) {
//        greet();
//        int firstNumber = readNumber() + 4;
//        int secondNumber = readNumber() + 1;
//
//        int sum = firstNumber + secondNumber;
//        System.out.println("Sum of the number is: " + sum);
//
//
//    }
//
//    public static int readNumber() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int number = input.nextInt();
//        return number;
//    }
//
//    public static void greet() {
//        System.out.println("Welcome the sum of number");
//    }
//}


                     // solve the questions from number 28

//class function {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Multiplication of table:");
//        System.out.println("Enter the number:");
//        int num = input.nextInt();
//        printMultiplication(num);
//    }
//    public static void printMultiplication (int num){
//        int i =1;
//        while(i<=10){
//            System.out.println(num + " X " + i + " = " + (num * i));
//            i++;
//        }
//    }
//}


                        // 29  sum of odd number

//class function {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, sum all odd numbers: ");
//        System.out.println("Enter the number:");
//        int num = input.nextInt();
//        int result = sumOddNumber(num);
//        System.out.println("odd till " + num + " is " + result);
//    }
//    public static int sumOddNumber(int num){
//        int i = 1;
//        int sum = 0;
//        while(i<=num){
//            sum += i;
//            i += 2;
//        }
//        return sum;
//    }
//}


                      // 30 factorial

//class function {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to the factorial number: ");
//        System.out.println("Enter the number:");
//        int num = input.nextInt();
//        long fact = factorialNum(num);
//        System.out.println("Factorial is: " + fact);
//
//    }
//    public static long factorialNum(int num){
//        if(num < 2){
//            return 1;
//        }
//        int i=2;
//        long fact = 1;
//        while(i<=num){
//            fact *= i;
//            i++;
//        }
//        return fact;
//    }
//}

                   // 31 sum of the digits
//public class function {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to sum of the digits");
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//        int result = sumOfDigits(num);
//        System.out.println("The sum of the digit is" + result);
//    }
//    public static int sumOfDigits(int num){
//        int sum = 0;
//        while(num > 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//      return sum;
//    }
//}


                    //32 Least Common Multiple
// start at first and multiply the first till the second value is divisible by multiplication of first
//class function {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome, to the LCM: ");
//         System.out.println("Enter your first number:");
//         int first = input.nextInt();
//         System.out.println("Enter your second number:");
//         int second = input.nextInt();
//         int lcm = lcm(first, second);
//         System.out.println("The LCM no.: " + lcm);
//
//     }
//     public static int lcm(int first, int second){
//         int i = 1;
//         while(i <= second){
//            int factor = first * i;
//            if(factor % second == 0){
//                return factor;
//            }
//            i++;
//         }
//         return 0;
//     }
// }


                 // 33 GCD (Greatest Common Integer) this is done
// lets two number a and b.Take least value of a and b and after that contain a loop i until least value
// if we get the least value the put that value in gcd until get the greatest value that are completely divisible by that number.

//class function{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to find GCD.");
//        System.out.println("Enter the first number:");
//        int first = sc.nextInt();
//        System.out.println("Enter the second number:");
//        int second = sc.nextInt();
//        int gcd = gcd(first, second);
//        System.out.println("The gcd of two number is" + gcd);
//    }
//    public static int gcd(int num1, int num2){
//        int gcd = 1;
//        int i = 1;
//        int least = least(num1, num2);
//        while(i <= least){
//            if(num1 % i ==0 && num2 % i ==0){
//                gcd = i;
//            }
//            i++;
//        }
//        return gcd;
//    }
//    public static int least(int num1, int num2){
//        if(num1 < num2){
//            return num1;
//        }else {
//            return num2;
//        }
//    }
//}
              // 34  given number is prime

//class function {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to the prime number:");
//        System.out.println("Enter your number:");
//        int num = input.nextInt();
//        boolean isprime = primeNum(num);
//        if(isprime) {
//            System.out.println("Your number is prime;");
//        }else {
//            System.out.println("Your number is not prime:");
//        }
//
//    }
//    public static boolean primeNum(int num){
//        int i = 2;
//        while(i < num){
//            if(num % i == 0){
//                return false;
//            }
//            i++;
//
//        }
//        return true;
//    }
//}

                              // 35  reverse the digits of the number

//class function {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to the reverse of the digits:");
//        System.out.println("Enter the number:");
//        int num = input.nextInt();
//        int result = reverseDigit(num);
//        System.out.println("Your reverse number is:" +result);
//
//    }
//    public static int reverseDigit(int num){
//        int reverse = 0;
//        while(num > 0){
//            reverse = (reverse * 10) + (num % 10);
//            num /= 10;
//        }
//        return reverse;
//    }
//}


                          // 36 print the fabonacci series

//class function {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to enter the fabonacci series:");
//        System.out.println("Enter your number:");
//        int num = input.nextInt();
//        fabonacciSer(num);
//
//    }
//    public static void fabonacciSer(int num){
//        if(num < 0) return;
//        System.out.print("0 ");
//        if(num == 0) return;
//        System.out.print("1 ");
//        int first = 0, second = 1;
//        while(first + second <= num){
//            int third = first + second;
//            System.out.print(third + " ");
//            first = second;
//            second = third;
//        }
//    }
//}

                              // 37 Armstrong number
// firstly find the no. of digits then find power of digits then seperate all digit one by one
// and power all digit by no. of digits and the sum all digits if the final result
// is equal to the number that we take then that number are the armstrong.
//class function {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to find the armstrong number:");
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//        boolean isArmstrong = isArmstrong(num);
//        if(isArmstrong){
//            System.out.println("The given number is armstrong:");
//        } else{
//            System.out.println("The given number is not armstrong:");
//        }
//    }
//
//    public static boolean isArmstrong(int num){
//        int noOfDigits = noOfDigits(num);
//        int numcopy = num;
//        int finalresult = 0;
//        while(num > 0){
//            int digits = num % 10;
//            num /= 10;
//            finalresult += power(digits, noOfDigits);
//        }
//        return finalresult == numcopy;
//    }
//    public static int noOfDigits(int num){
//        int digits = 0;
//        while(num > 0){
//            digits++;
//            num /= 10;
//        }
//        return digits;
//    }
//    public static int power(int num1, int num2){
//        int result = 1;
//        int i = 0;
//        while(i < num2){
//            result *= num1;
//            i++;
//        }
//        return result;
//    }
//
//                              }

                              // 38 Palindrome number

//class function {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to enter your Palindrome number:");
//        System.out.println("Enter your number:");
//        int num = input.nextInt();
//        boolean isPalindrome = isPalindrome(num);
//        if(isPalindrome){
//            System.out.println("Your number is Palindrome:");
//        }else{
//            System.out.println("Your number is not palindrome:");
//        }
//    }
//    public static boolean isPalindrome(int num){
//        int reverse = 0;
//        int numCopy = num;
//        while(num > 0){
//            reverse = (reverse * 10) + (num % 10);
//            num /= 10;
//        }
//        return reverse == numCopy;
//    }
//}

                                // 39 print pattern

//class function {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to the number of pattern\n:");
//        System.out.print("Enter your number of rows:");
//        int rows = input.nextInt();
//        leftHand(rows);
//    }
//    public static void leftHand(int maxRows){
//        int rows = maxRows;
//        while(rows > 0){
//            System.out.println(" ");
//            int i =0;
//            while(i < rows){
//                System.out.print(" *");
//                i++;
//            }
//            System.out.println();
//            rows--;
//        }
//    }
//}













