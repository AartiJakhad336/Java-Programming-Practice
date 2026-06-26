                              // BASICS

// 1. //public class revisionQues {
//    public static void main(String[] args){
//        System.out.println("Hello, World!");
//    }
//}


import java.util.Scanner;

//public class revisionQues{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number;");
//        int num = input.nextInt();
//        System.out.println(num);
//    }
//}


// 3. Add two integer number entered by user
//public class revisionQues{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to add two integer:");
//        System.out.println("Please, enter the first number:");
//        int num1 = input.nextInt();
//        System.out.println("Enter the second number:");
//        int num2 = input.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum of number is:" + sum);
//    }
//}

// 4. Write a program where the user is asked to enter two
//integers (divisor and dividend) and the quotient and the
//remainder of their division is computed.(Both divisor and
//dividend should be integers.)

//class Main{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to find Quotient and the remainder:");
//        System.out.println("Please, enter the dividend:");
//        int dividend = input.nextInt();
//        System.out.println("Enter the divisor:");
//        int divisor = input.nextInt();
//        int quotient = dividend / divisor;
//        System.out.println("The Quotient is:" + quotient);
//        int reminder = dividend % divisor;
//        System.out.println("The Reminder is:" + reminder);
//    }
//}


// 5.Write a Program to Find Size of int, float, double and char
//in your computer
// NOTE: java mai sizeof operator nhii hota hai. Java mai dataType
// ka size fix hota hai
//class Main{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("size of int: " + Integer.BYTES + "bytes");
//        System.out.println("size of float: " + Float.BYTES + "bytes");
//        System.out.println("size of double: " + Double.BYTES + "bytes");
//        System.out.println("size of char: " + Character.BYTES + "bytes");
//    }
//}


// 6.Write a Program to Swap Two Number
//class Main{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to swap two number:");
//        System.out.println("Please, enter the first number:");
//        int num1 = input.nextInt();
//        System.out.println("Enter the second number:");
//        int num2 = input.nextInt();
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//        System.out.println("After swap:\n " + num1+ " is the first number:\n " + num2 + " is the second number:");
//    }
//}


// 7. Write a Program to Find ASCII Value of a Character
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a character:");
//        char ch = sc.next().charAt(0);
//
//        int ascii = ch;
//
//        System.out.println("ASCII value of " + ch + " is " + ascii);
//    }
//}


//8.Write a Program to Multiply two decimal Numbers
//entered by User
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome, to multiply two decimal number:");
//        System.out.println("Please, enter the first number:");
//        float num1 = sc.nextFloat();
//        System.out.println("Enter the second number:");
//        float num2 = sc.nextFloat();
//        float result = num1 * num2;
//        System.out.println("The multiplication of number is: " + result);
//    }
//}



//                           IF - ELSE
// 1. Write a Program to Check Whether Number is Even or odd
//class ifElse{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome, to check even or odd:");
//        System.out.println("Please, enter the number:");
//        int num = sc.nextInt();
//        if(num % 2 == 0){
//            System.out.println("The given number is Even:");
//        }else{
//            System.out.println("The given number is Odd:");
//        }
//    }
//}


// 2. Write a Program to Check Whether a Character is Vowel or Consonant.
//class ifElse{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to check vowels or Consonant:");
//        System.out.println("Enter the character:");
//        char ch = sc.next().charAt(0);
//
//        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
//            System.out.println("The character is vowel:");
//        }else{
//            System.out.println("The given character is consonant:");
//        }
//    }
//}


// 3. Write a Program to Find Largest Number Among Three Numbers entered by users
//class ifElse{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome, to find largest number:");
//        System.out.println("Please, enter the first number:");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number:");
//        int b = sc.nextInt();
//        System.out.println("Enter the third number:");
//        int c = sc.nextInt();
//
//        if(a > b && a > c){
//            System.out.println("a is the largest number:");
//        }else if(b > c){
//            System.out.println("b is the greatest number:");
//        }else{
//            System.out.println("c is the greatest number:");
//        }
//    }
//}


// 4.  Write a Program which accepts coefficients of a
//quadratic equation from the user and displays the roots
//(both real and complex roots depending upon the
//discriminant).
//class ifElse{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome, to displays the roots:");
//        System.out.println("Enter the a, b, c:");
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        double d = b*b - 4*a*c;
//        System.out.println("The disciminant number is:" + d);
//        if(d > 0){
//            double root1 = (-b + Math.sqrt(d))/ (2*a);
//            double root2 = (-b - Math.sqrt(d))/ (2*a);
//            System.out.println("The roots are real and different:");
//            System.out.println("root1 :" + root1);
//            System.out.println("root2 :" + root2);
//        }else if(d == 0){
//            double root = -b / (2*a);
//            System.out.println("The roots are real or equals:");
//            System.out.println("roots :" + root);
//        }else{
//            double real = -b / (2*a);
//            double img = Math.sqrt(-d)/ (2*a);
//            System.out.println("The roots are complex:");
//            System.out.println("Root1 " + real + " + " + img + "i");
//            System.out.println("Root2 " + real + " - " + img + "i");
//        }
//    }
//}


// 5. Write a Program to Check whether a year entered by user is Leap Year or not

//class ifElse{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome, to check leap year or not:");
//        System.out.println("Please, enter the year:");
//        int year = sc.nextInt();
//        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
//            System.out.println("The given year is leap year:");
//        }else{
//            System.out.println("The given year is not leap year:");
//        }
//    }
//}



// Take integer input and print the absolute value of that integer
//class ifElse{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number:");
//        int n = sc.nextInt();
//        if(n >= 0){
//            System.out.println(n);
//        }else{
//            System.out.println(-(n));
//        }
//        if(n < 0)
//            n = -n;
//            System.out.println(n);
//    }
//}


// Take real number input and check if it is an integer
// or not
//class ifElse{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter real number:");
//        double n = sc.nextDouble();
//        int x = (int)n;
//        if(n - x == 0){
//            System.out.println("Is an integer:");
//        }else{
//            System.out.println("Not an Integer:");
//        }
//    }
//}


//Profit or loss
//class ifElse{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter cost Price:");
//        int cp = sc.nextInt();
//        System.out.println("Enter Selling Price:");
//        int sp = sc.nextInt();
//        if(cp == sp){
//            System.out.println("no profit or no loss:");
//        }else if(cp > sp){
//            System.out.println("My loss is: " + (cp - sp));
//        }else{
//            System.out.println("My profit is: " + (sp - cp));
//        }
//    }
//}


// take positive Integer input and tell if it is a four digits number or not
//class ifElse{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the digit:");
//        int digit = sc.nextInt();
//        if(digit > 999 && digit < 10000){
//            System.out.println("yes it is four digit:");
//        }else{
//            System.out.println("Not four digits:");
//        }
//    }
//}


// Take integer input and tell if its magnitude is smaller than
// 69 or not      // magnitude == absolute value
//class ifElse{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//        if(Math.abs(num) < 69){
//            System.out.println("It is smaller than 69:");
//        }else{
//            System.out.println("It is not smaller than 69:");
//        }
//    }
//}


// Take 3 positive integers input and tell if they can be the sides
// of a triangle
// a+b > c && b+c > a && a+c > b
//class ifElse{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number a:");
//        int a = sc.nextInt();
//        System.out.println("Enter the number of b:");
//        int b = sc.nextInt();
//        System.out.println("Enter the number of c:");
//        int c = sc.nextInt();
//        if(a+b > c && b+c > a && a+c > b){
//            System.out.println("Yes, it is the sides of a triangle:");
//        }else{
//            System.out.println("Not, the sides of a triangle:");
//        }
//    }
//}


// Given a point (x, y), write a program to find out if it lies
// in the 1st Quadrant, 2nd Quadrant, 3rd Quadrant, 4th Quadrant, on
// the x-axis, y-axis or at the origin
//class ifElse{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the x:");
//        int x = sc.nextInt();
//        System.out.println("Enter the Y:");
//        int y = sc.nextInt();
//        if(x == 0 && y == 0){
//            System.out.println("Point is at origin");
//        }else if(x == 0){
//            System.out.println("Point on y-axis:");
//        }else if(y == 0){
//            System.out.println("Point on x-axis:");
//        }else if(x > 0 && y > 0){
//            System.out.println("1st Quadrant:");
//        }else if(x < 0 && y > 0){
//            System.out.println("2nd Quadrant:");
//        }else if(x < 0 && y < 0){
//            System.out.println("3rd Quadrant:");
//        }else{
//            System.out.println("4th Quadrant:");
//        }
//    }
//}


//                      LOOP
// 1. Write a Program to Calculate Sum of first N Natural
//Numbers (here value of N is Entered by user)
//class Loop{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int N = sc.nextInt();
//        int i = 1;
//        int sum = 0;
//        while(i <= N){
//            sum += i;
//            i++;
//        }
//        System.out.println("Sum of number is: " +sum);
//    }
//}


// 3. Write a Program to Find Factorial of a given number N
// (N is entered by user)
//class Loop{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int N = sc.nextInt();
//        int i = 1;
//        int fact = 1;
//        while(i <= N){
//            fact *= i;
//            i++;
//        }
//        System.out.println("Factorial = " + fact);
//    }
//}


// 4. Write a Program to Display Fibonacci Series upto nth
//term (n is entered by user)
//class Loop{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int i = 1;
//        int firstNum = 0;
//        int secondNum = 1;
//        while(i <= num){
//            System.out.print(firstNum + " ");
//            int nextNum = firstNum + secondNum;
//            firstNum = secondNum;
//            secondNum = nextNum;
//            System.out.print(nextNum + " ");
//            i++;
//            }
//        }
//    }


// 4. Write a Program to Generate Multiplication Table of a
//number (entered by the user) using a for loop.
//class Loop{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for(int i = 1; i <= 10;i++){
//            int result;
//            result = num * i;
//            System.out.println("The multiplication of num is: " + result);
//        }
//    }
//}


// 5. Write a Program to Display Fibonacci Series upto
//certain number n (n is entered by user)
//Example: n=100
//Output:
//Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
//class Loop{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        while(a < num){
//            System.out.print(a + " ");
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//    }
//}


// 6.Write a Program to Find GCD or HCF of two numbers
//entered by user
//class Loop{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        int a = sc.nextInt();
//        System.out.println("Enter your second number:");
//        int b = sc.nextInt();
//        int gcd = 1;
//        for(int i =1; i <= a && i <= b;i++){
//            if(a % i == 0 && b % i == 0){
//                gcd = i;
//            }
//        }
//        System.out.println("GCD = " + gcd);
//    }
//}


//  Write a Program to Find LCM of two numbers entered
//by user
//class LCM{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number:");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number:");
//        int b = sc.nextInt();
//        int max = a > b? a:b;
//        while(true){
//            if(max % a == 0 && max % b == 0){
//                System.out.println("LCM = " + max);
//                break;
//            }
//            max++;
//        }
//    }
//}



// 7.  Write a Program to Reverse a given Number N by user
//class Reverse{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//        int reverse = 0;
//        while(num > 0) {
//            reverse = (reverse * 10) + (num % 10);
//            num /= 10;
//        }
//        System.out.println("Reverse = " + reverse);
//    }
//}


// 8. Write a Program to display sum of all digits of a given
//Number N by user
//class sumOfDigits{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number:");
//        int num = sc.nextInt();
//        int sum = 0;
//        while(num > 0){
//            sum += (num % 10);
//            num /= 10;
//        }
//        System.out.println("Sum of digits is:" + sum);
//    }
//}


// 10. Write a Program to Calculate Power of a Number
//using inbuilt pow() function by taking two inputs from
//users as Base and exponent respectively
//class PowerOfNum{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the base number:");
//        int base = sc.nextInt();
//        System.out.println("Enter the exponential number:");
//        int exp = sc.nextInt();
//        int result = (int)Math.pow(base, exp);
//        System.out.println("The power of a number is: " + result);
//    }
//}


// 11. Write a Program to Calculate Power of a Number
//without using inbuilt pow() function by taking two
//inputs from users as Base and exponent respectively
//class powerOfNum{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the base number:");
//        double base = sc.nextDouble();
//        System.out.println("Enter the exponent:");
//        int exp = sc.nextInt();            // exponent ko double lene ki jarurat nhii hai
        // kyuki loop integer count pe chlte hai
//        int i = 0;
//        double result = 1;
//        while(i < exp){
//            result *= base;
//            i++;
//        }
//        System.out.println("The power of exponential is " + result);
//    }
//}


// 12. Write a Program to Check Whether a Number N
//entered by user is Palindrome or Not
//class Palindrome{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please, enter your number:");
//        int num = sc.nextInt();
//        int original = num;
//        int reverse = 0;
//        while(num > 0){
//            reverse = (reverse * 10) + (num % 10);
//            num /= 10;
//        }
//        System.out.println("Reverse = " + reverse);
//        if(reverse == original){
//            System.out.println("Your number is palindrome:");
//        }else{
//            System.out.println("Your number is not palindrome:");
//        }
//    }
//}


// 13. Write a Program to Check Whether a Number is Prime
//or Not
//class Prime{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please, enter your number:");
//        int num = sc.nextInt();
//        int i = 2;
//        boolean isPrime = true;
//        while(i < num){
//            if(num % i == 0){
//                isPrime = false;
//                break;
//            }
//            i++;
//        }
//        if(isPrime && num > 1){
//            System.out.println("Your number is prime:");
//        }else{
//            System.out.println("Your number is not prime:");
//        }
//    }
//}


// 14. Write a Program to Display Prime Numbers Between
//Two Intervals (entered by user)
//Example:
//Enter two numbers: 0 20
//Prime numbers between 0 and 20 are:
//2 3 5 7 11 13 17 19
//class primeNum{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the starting number:");
//        int start = sc.nextInt();
//        System.out.println("Enter the ending number:");
//        int end = sc.nextInt();
//        System.out.println("The prime num blw " + start + " and " + end);
//        int num;
//        for(num = start; num <= end;num++){
//            if(num < 2) continue;
//            boolean isPrime = true;
//            for(int i = 2; i < num; i++){
//                if(num % i == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime) {
//                System.out.print(num + " ");
//            }
//        }
//    }
//}


// 15. Write a Program to check whether a number entered
//by the user is an Armstrong number or not.
//class armstrong{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//        int digit = 0;
//        int original = num;
//        while(num > 0){
//            digit++;
//            num /= 10;
//        }
//        System.out.println(digit);
//        int temp = original;
//        int result = 0;
//        while(temp > 0) {
//            int reverse = (temp % 10);
//            temp /= 10;
//            result += (int)Math.pow(reverse, digit);
//        }
//        System.out.println(result);
//        if(result == original){
//            System.out.println("It is armstrong:");
//        }else{
//            System.out.println("It is not armstrong:");
//        }
//    }
//}



// 16. Write a Program to Display all Factors of a Number
//entered by User
//class factor{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//        System.out.print("Factor is: ");
//        for(int i = 1; i <= num;i++){
//            if(num % i == 0){
//                System.out.print(i + " ");
//            }
//        }
//    }
//}


// Print all odd number divisible by 3 from 1 to 100.
//class Loop{
//    public static void main(String[] args){
//        for(int i =0; i < 100;i++){
//            if(i % 3 == 0 && i % 2 != 0){
//                System.out.print(i + " ");
//            }
//        }
//    }
//}

//class Loop{
//    public static void main(String[] args){

//        int a = 99, d = 4;
//        for(int i = 99; i > 0; i-=4){
//            System.out.print(i + " ");
//        }
//        a -= d;
//    }
//}


// Take 'n' as input from user and print the following sequence...
// 1
// n
// 2
// n-1
// 3
// n-2
// ...
//class sequence{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i <= n;i++){
//            System.out.println(i + " \n" +(n - i + 1));
//        }
//    }
//}


// composite number or not
//class composite{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//        int count = 0;
//        for(int i= 1;i <= num;i++){
//            if(num % i == 0){
//                System.out.print(i + " ");
//                count++;
//            }
//        }
//        if(count > 2){
//            System.out.println("Composite Number:");
//        }else{
//            System.out.println("Not a composite number:");
//        }
//    }
//}


// Find factor by method of sqrt.
//class factor{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for(int i =1;i<=Math.sqrt(num);i++){
//            if(num % i == 0){
//                System.out.println(i);
//                System.out.println(num/i);
//            }
//        }
//    }
//}




                                     // PATTERN
//1) Solid Rectangular star
//        * * * * *
//        * * * * *
//        * * * * *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=col;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}



// 2) Hollow Rectangular star
//* * * * *
//*      *
//* * * * *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int col = sc.nextInt();
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=col;j++){
//                if(i==1 || i==rows || j==1 || j==col/2+rows){
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//3) Half Pyramid Star Pattern
//*
//* *
//* * *
//* * * *
//* * * * *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


// 4) Inverted Half pyramid
//* * * * * *
//* * * * *
//* * * *
//* * *
//* *
//*
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<=n-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


// 5) Full Pyramid Star Pattern
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int k=1;k<=n-i;k++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


// 6) Inverted Full pyramid
//* * * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int k=1;k<=i;k++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=n-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


//7)Hollow Full Pyramid Star
//   *
//  * *
// *   *
//*     *
//*******
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n-1;i++){
//            for(int j=1;j<=n-1-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                if(j==1 || j==i){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        for (int k=1;k<=2*n-3;k++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//}


// 8) Half pyramid using numbers
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}



//   9) Pascal Triangle
//
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=0;i<n;i++){
//            int num =1;
//            for(int j=0;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=i;j++){
//                System.out.print(num + " ");
//                num = num * (i-j)/(j+1);
//            }
//            System.out.println();
//        }
//    }
//}










                              // METHODS
//1) Write a Program to Display Prime Numbers Between Two
// Intervals (entered by the user) Using Functions

//class method{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        primeNum(num1, num2);
//    }
//    public static void primeNum(int num1, int num2){
//        for(int i=num1;i<=num2;i++){
//            int count =0;
//            for(int j=1;j<=i;j++){
//                if(i%j == 0){
//                    count++;
//                }
//            }
//            if(count == 2){
//                System.out.print(i + " ");
//            }
//        }
//    }
//}



// 2.) 2) Write a Program to check if an integer (entered by the user)
//can be expressed as the sum of two prime numbers,if yes then
//print all possible combinations with the use of functions.
//Example
//Enter a positive integer: 34
//OUTPUT:
//34 = 3 + 31
//34 = 5 + 29
//34 = 11 + 23
//34 = 17 + 17
//class method{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        primeSum(num);
//    }
//    public static void primeSum(int num){
//        for(int i=2;i<=num/2;i++){
//            if(isPrime(i) && isPrime(num - i)){
//                System.out.println(num + "=" + i + "+" + (num - i));
//            }
//        }
//    }
//    public static boolean isPrime(int n){
//        if(n <= 1){
//            return false;
//        }
//        for(int j=2;j<=n/2;j++){
//            if(n%j==0){
//                return false;
//            }
//        }
//        return true;
//    }
//}



//Write a Program to Convert Binary Number to Decimal
//manually by creating user-defined function
//class method{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int binary = sc.nextInt();
//        int result = binaryToDecimal(binary);
//        System.out.println(result);
//    }
//    public static int binaryToDecimal(int binary){
//        int decimal = 0;
//        int power = 0;
//        while(binary != 0){
//            int digit = binary % 10;
//            decimal = (int) (decimal + digit * Math.pow(2, power));
//            binary /= 10;
//            power++;
//        }
//        return decimal;
//    }
//}



// 4) Write a Program to Convert Decimal to Binary number
//manually by creating user-defined functions.

//import java.util.Scanner;
//
//class DecimalToBinary {
//
//    static void decimalToBinary(int num) {
//        int[] binary = new int[32];
//        int i = 0;
//
//        if (num == 0) {
//            System.out.println("Binary = 0");
//            return;
//        }
//
//        while (num > 0) {
//            binary[i] = num % 2;
//            num = num / 2;
//            i++;
//        }
//
//        System.out.print("Binary = ");
//        for (int j = i - 1; j >= 0; j--) {
//            System.out.print(binary[j]);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a decimal number: ");
//        int num = sc.nextInt();
//
//        decimalToBinary(num);
//
//        sc.close();
//    }
//}



