//59.  Using do-while to find password checker until a valid password is entered

import java.util.Scanner;

//public class recursionQues {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to check valid password:");
//        String password;
//        do {
//            System.out.println("Please, enter the password:");
//            password = input.next();
//        }while(password.length() < 6);
//        System.out.println("Your password is valid");


        // by method
//        System.out.println("Welcome to password Checker:");
//        String password;
//        do {
//            System.out.println("Please, enter your password:");
//            password = input.next();
//        }while(!isValidPassword(password));
//            System.out.println("Your given password is valid:");
//    }
//    public static boolean isValidPassword(String password){
//        return password.length() > 6;
//    }
//}



// 60.  A Number Guessing Game

//class recursionQues{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to guessing the number:");
//        int number = 5, guess;
//        do{
//            System.out.println("Please, enter the number between 1 to 10:");
//            guess = input.nextInt();
//        }while(guess != number);
//        System.out.println("Yes, you guess the correct number:");
//    }
//}


// 61. Using for loop multiplication table for a number:

//public class recursionQues{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the multiplication of the table:");
//        int num;
//        System.out.println("Please, enter the number:");
//        num = input.nextInt();
//        for(int i = 1;i<=10;i++){
//            int result = 0;
//            result = num * i;
//            System.out.println("The multiplication of your number is: " + result);
//        }
//
//    }
//}


// 62. With the help of for loop check your number is prime number or not

//public class recursionQues {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to check the given number is prime or not:");
//        int num;
//        System.out.println("Please, enter your number:");
//        num = input.nextInt();
//        boolean isPrime = isPrime(num);
//        if(isPrime){
//            System.out.println("Your number is prime:");
//        }else{
//            System.out.println("Your number is not prime:");
//        }
//
//    }
//    public static boolean isPrime(int num){
//        for(int i = 2; i < num; i++){
//            if(num % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//}



// 63. With the help of for each to find the maximum value of the integer array

//public class recursionQues{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to find maximum value in the integer:");
//        System.out.println("Enter the size of the array:");
//        int size = input.nextInt();
//        int[] num = new int[size];
//        int i = 0;
//        while(i < size){
//            System.out.println("The number of the array is " + (i +1) + " ");
//            num[i] = input.nextInt();
//            i++;
//        }
//        int max = Integer.MIN_VALUE;
//        for(int nums : num){
//            if(max < nums) {
//                max = nums;
//            }
//        }
//        System.out.println("Maximum number is " + max);
//    }
//}


// 64. occurence of the specific element in the array
//public class recursionQues{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to number of occurence of the specific element:");
//        System.out.println("Please, enter the size of the array:");
//        int size = input.nextInt();
//        int[] nums = new int[size];
//        int i = 0;
//        while(i < size){
//            System.out.println("The number of the array is " + (i+1) + " ");
//            nums[i] = input.nextInt();
//            i++;
//        }
//        System.out.println("Enter your element for occurence:");
//        int element = input.nextInt();
//        int occ = noOfOccurences(nums, element);
//        System.out.println("The no of occurences is " + occ + " ");
//    }
//    public static int noOfOccurences(int[] nums, int element){
//        int occ = 0;
//        for(int num : nums){
//            if(num == element){
//                occ++;
//            }
//        }
//        return occ;
//    }
//}


// 65. Using break to read inputs from the user in the loop and break the loop if a specific
// keyword (like "exit") is entered
//public class recursionQues{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to read input from user until ('exit') kayword entered:");
//        String command;
//        while(true){
//            System.out.println("Please, enter the command:");
//            command = input.next();
//            if(command.equalsIgnoreCase("exit")){
//                break;
//            }
//        }
//        System.out.println("Your command is entered:");
//    }
//}


// 66. Using Continue to sum all the positive number entered by the user skip negative number
//public class recursionQues{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to sum all positive number except negative number:");
//        System.out.println("Please, enter the size of the array:");
//        int size = input.nextInt();
//        int[] nums = new int[size];
//        int i = 0;
//        while(i < size){
//            System.out.println("Your number of the array is " + (i+1) + " ");
//            nums[i] = input.nextInt();
//            i++;
//        }
//        int sum = 0;
//        for(int num : nums){
//            if(num < 0){
//                continue;
//            }
//            sum += num;
//        }
//        System.out.println("The sum of all positive number is " + sum);
//    }
//}



// 67. Using Continue print all even number and skip all odd number
// isko hmm direct bhii kr skte hai for loop ki help se kyuki question mai bola nhii gya hai ki
// user se input lo
//public class recursionQues{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to print all even number:");
//        System.out.println("Please, enter the size of the number:");
//        int size = input.nextInt();
//        int[] nums = new int[size];
//        int i = 0;
//        while(i < size){
//            System.out.println("The number of the array is: "+ (i+1) + " ");
//            nums[i] = input.nextInt();
//            i++;
//        }
//
//        for(int num : nums){
//            if(num % 2 != 0){
//                continue;
//            }
//            System.out.println("Your even number is: " + num);
//        }
//    }
//}



//68. (RECURSION) display the fibonaci series upto certain number

//public class recursionQues{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to fibonacci series:");
//        System.out.println("Enter the certain number:");
//        int count = input.nextInt();
//        for(int i = 1;i <= count;i++){
//            System.out.println(fibonacci(i) + " ");
//        }
//    }
//    public static int fibonacci(int position){
//        System.out.print(".");
//        if(position == 1){
//            return 0;
//        }
//        if(position == 2){
//            return 1;
//        }
//        return fibonacci(position-1) + fibonacci(position - 2);
//    }
//}



//69. Check palindrom using recursion
//public class recursionQues{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to check palindrome:");
//        System.out.println("please, enter the command:");
//        String str = input.next();
//        boolean isPalindrome = isPalindrome(str);
//        if(isPalindrome){
//            System.out.println("The given string is palindrome:");
//        }else{
//            System.out.println("The given string is not palindrome:");
//        }
//
//    }
//    public static boolean isPalindrome(String str){
//        if(str.length() <= 1){
//            return true;
//        }
//        int lastPos = str.length()-1;
//        if(str.charAt(0) != str.charAt(lastPos)){
//            return false;
//        }
//        String newStr = str.substring(1,lastPos);
//        return isPalindrome(newStr);
//    }
//}


