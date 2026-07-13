//public class Array {
//    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[1] = 65;
//        myArr[4] = 94;
//        myArr[2] = 3;
//        myArr[3] = 1;
//        int[] myArr = {98,4,2,9,7};
//        int index = 2;
//
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[4]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[index]);
//        int index = 0;
//        while (index <myArr.length){
//            System.out.println(myArr[index]);
//            index++;
//        }
//    }
//}

//import java.util.Scanner;
//
//                                   Array Searching
//public class Array{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr = {2,4,98,97,96,3,34,44,45};
//        System.out.println("Welcome to Array Searching\n");
//        System.out.println("Enter the number you want to search:");
//        int num = input.nextInt();
//        boolean isFound = isFound(arr, num);
//        if(isFound){
//            System.out.println("Your number was found in array:");
//
//        }else{
//            System.out.println("Your number was not found in array:");
//        }
//
//    }
//    public static boolean isFound(int[] arr, int num){
//        int index = 0;
//        while(index<arr.length){
//            if(arr[index] == num){
//                return true;
//            }
//            index++;
//        }
//        return false;
//    }
//}



                           // Start
//public class Array{
//    public static void main(String[] args){
//        int[] myArr = new int[5];
//        int[] myArr = {50, 6, 76, 80, 90};
//        myArr[0] = 50;
//        myArr[2] = 66;
//        myArr[3] = 76;
//        myArr[1] = 80;
//        myArr[4] = 90;
//        int index = 0;
//        while(index < 5){
//            System.out.println(myArr[index]);
//            index++;
//        }
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
//    }
//}



                 // Array Searching
//    import java.util.*;
//public class Array{
//    public static void main(String[] args){
//        int[] arr = {4, 45, 67, 98, 84, 36, 54, 90};
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to searching a number into Array:");
//        System.out.println("Enter the number of the Array:");
//        int num = input.nextInt();
//        boolean isFound = isFound(arr, num);
//        if(isFound){
//            System.out.println("The number is found in the array:");
//        }else{
//            System.out.println("The number is not found in the array:");
//        }
//    }
//    public static boolean isFound(int[] arr, int num){
//        int index = 0;
//        while(index < arr.length) {
//            System.out.println(arr[index]);

//            if(arr[index] == num) {
//                return true;
//            index++;
//        }
//            index++;


//        }
//        return false;
//        String[] strArr = new String[4];
//        strArr[0] = "my String";
//
//        String[] newStrArr = {"Aarush", "Anhsu", "Adity"};
//        System.out.println(strArr.length);
//    }
//}


//                       DSA in java (Array)

//Print sum of element of the array
//import java.util.*;
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size:");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the element of the Array:");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for(int i=0;i<n;i++){
//            sum += arr[i];
//        }
//        System.out.print(sum + "");
//    }
//}



//Print the Maximum element in the array
//import java.util.*;
//class Array{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size:");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the element:");
//        for(int i= 0;i<n;i++){
//            arr[i] = sc.nextInt();
//            }
//        int max = arr[0];
//        for(int i =0;i<n;i++){
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.print(max);
//    }
//}


// Multiply odd indexed element by 2 and add 10 to even indexed elements
//import java.util.*;
//class Main{
//    public static void main(String[] args){
//       int[] arr = {10,20,30,40,50,60};
//       for(int i=0;i<arr.length;i++){
//           if(i%2 != 0){
//               System.out.print(2*arr[i] + " ");
//           }else{
//               System.out.print(10 + arr[i] + " ");
//           }
//       }
//    }
//}


// Search in Array
//import java.util.*;
//class Array{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int target = sc.nextInt();
//        boolean found = false;
//        for(int i=0;i<n;i++) {
//            if (arr[i] == target) {
//                found = true;
//                break;
//            }
//        }if(found){
//            System.out.print("Target is found:");
//        }else{
//            System.out.print("Target is not found:");
//        }
//    }
//}


import java.util.Scanner;

// Two Sum
//class Array{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int target = sc.nextInt();
//        boolean found = false;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i] + arr[j] == target){
//                    found = true;
//                    break;
//                }
//            }
//        }
//        if (found) {
//            System.out.println("The number is found ");
//        }else{
//            System.out.println("not found");
//        }
//    }
//}


//Print the second maximum element in the array
//class Array{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for(int i=0;i<n;i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        int secMax = arr[0];
//        for(int i=0;i<n;i++){
//            if(arr[i] > secMax && arr[i] != max){
//                secMax = arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(secMax);
//    }
//}


// Reverse Array
//class Array{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int i=0,j=n-1;
//        while(i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        for(int k=0;k<n;k++) {
//            System.out.print(arr[k] + " ");
//        }
//    }
//}

// second method for reverse array
//class Array {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i=0;i<n/2;i++){
//            int temp = arr[i];
//            arr[i] = arr[n-1-i];
//            arr[n-1-i] = temp;
//        }
//        for(int k=0;k<n;k++){
//            System.out.println(arr[k] + " ");
//        }
//    }
//}



// Merge two sorted array
import java.util.*;
//class Array{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++) {
//            arr[i] = sc.nextInt();
//        }
//        int m = sc.nextInt();
//        int[] arr2 = new int[m];
//        for(int i=0;i<m;i++){
//            arr2[i] = sc.nextInt();
//        }
//        int[] newArray = merge(arr, arr2);
//        for(int i=0;i<newArray.length;i++){
//            System.out.print(newArray[i] + " ");
//        }
//    }
//    public static int[] merge(int[] arr, int[] arr2){
//        int newSize = arr.length + arr2.length;
//        int[] finalArray = new int[newSize];
//        int i=0,j=0,k=0;
//        while(i<arr.length && j<arr2.length){
//            if(arr[i] < arr2[j]){
//                finalArray[k] = arr[i];
//                i++;
//                k++;
//            }else{
//                finalArray[k] = arr2[j];
//                j++;
//                k++;
//            }
//        }
//        while(i < arr.length){
//            finalArray[k] = arr[i];
//            i++;
//            k++;
//        }
//        while(j < arr2.length){
//            finalArray[k] = arr2[j];
//            j++;
//            k++;
//        }
//        return finalArray;
//    }
//}



//1.  Write a Program that takes N elements (max. value of N is 100
//and N is the float number specified by user) from user, stores data
//in an array and Calculates the average of those numbers.

//import java.util.*;
//class Array{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float N = sc.nextFloat();
//        float[] arr = new float[(int)N];
//        for(int i=0;i<N;i++){
//           arr[i] = sc.nextFloat();
//        }
//        float sum = 0;
//        float average = 0;
//        for(int i=0;i<N;i++){
//            sum += arr[i];
//        }
//        average = (int)sum/N;
//        System.out.print(average);
//    }
//}



//2. Write a Program that takes n element from user and displays
// the largest element of an array

//import java.util.*;
//class Array{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int max = 0;
//        for(int i=0;i<n;i++){
//            max = arr[i];
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.print("The largest element is " + max);
//    }
//}



//3.  Write a Program that calculates the standard deviation of 10
//data using arrays

//import java.util.*;
//class Array{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];
//        for(int i=0;i<10;i++){
//            arr[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for(int i=0;i<10;i++){
//            sum += arr[i];
//        }
//        int mean = sum / 10;
//        double sumOfSquare = 0;
//        for(int i=0;i<10;i++){
//            sumOfSquare += (arr[i] - mean) * (arr[i] - mean);
//        }
//        double varience = sumOfSquare / 10;
//        double standardDeviation = (double)Math.sqrt(varience);
//        System.out.print("The standard deviation of 10 data using arrays is " + standardDeviation);
//    }
//}


//Write a Program that takes the array of five element and the
//elements of that array are accessed using pointer.

