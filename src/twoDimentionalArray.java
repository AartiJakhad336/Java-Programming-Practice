//public class twoDimentionalArray {
//    public static void main(String[] args){
//        int[][] myArr = new int[2][3];
//        myArr[0][0] = 9;
//
//        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//       System.out.println(arr.length);
//        int i = 0;
//        while(i < arr.length){
//            int j = 0;
//            while(j < arr[i].length){
//                System.out.print(arr[i][j] + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}


                           // 40 Array challenges
// Find the sum and average of the array element
//import java.util.*;
//class twoDimentionlArray{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to sum and Average of the Array elements:");
//        System.out.println("Please enter the number of element;");
//        int size = input.nextInt();
//        int[] nums = new int[size];
//        int i =0;
//        while(i < size){
//            System.out.print("Please enter the element no." + (i+1) + ": ");
//            nums[i] = input.nextInt();
//            i++;
//        }
//        long sum = sum(nums);
//        double avg = average(nums);
//        System.out.println("Sum of the number is:" + sum);
//        System.out.println("Average of the number is:" + avg);
//    }
//    public static long sum(int[] numArray){
//        long sum = 0;
//        int i = 0;
//        while(i < numArray.length){
//            sum += numArray[i];
//            i++;
//        }
//        return sum;
//    }
//    public static double average(int[] newArray){
//        int[] number = newArray;
//        double sum = sum(number);
//        return sum / number.length;
//    }
//}


                     // 41. Find the number of occurance of an element of the Array
// no. of occurence means hmare pass kitne element hai no. of count of the element.
// hm kya krenge hm user se input element lenge phir count krenge element ko.

import java.util.Scanner;

//class twoDimentionalArray{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to count no. of occurence:");
//        System.out.println("Please enter the given number of the element:");
//        int size = input.nextInt();
//        int[] nums = new int[size];
//        int i = 0;
//        while(i < size){
//            System.out.println("The element of the number:" + (i+1) + ": ");
//            nums[i] = input.nextInt();
//            i++;
//        }
//        System.out.println("Enter the number:");
//        int num = input.nextInt();
//
//        int noOfOccurences = noOfOccurence(nums, num);
//        System.out.println("The no. of Occurences is " + noOfOccurences + " of the Array:");
//    }
//    public static int noOfOccurence(int[] numArr, int number) {
//        int count = 0;
//        int i = 0;
//        while(i < numArr.length){
//            if(numArr[i] == number){
//                count++;
//            }
//            i++;
//        }
//        return count;
//    }
//}


              //42. find the maximum and minimum element of the array
//class twoDimentionalArray{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to find maximum and minimum element:");
//        System.out.println("Enter the size of the element:");
//        int size = input.nextInt();
//        int[] nums = new int[size];
//        int i = 0;
//        while(i < size){
//            System.out.println("Enter the element of the Array:" + (i+1) + ": ");
//            nums[i] = input.nextInt();
//            i++;
//        }
//        int findMax = findMax(nums);
//        System.out.println("The maximum element is:" + findMax);
//        int findMin = findMin(nums);
//        System.out.println("The minimum element is:" + findMin);
//    }
//    public static int findMax(int[] arr){
//        int max = arr[0];
//        int i = 0;
//        while(i < arr.length){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//            i++;
//        }
//        return max;
//    }
//    public static int findMin(int[] arr){
//        int min = arr[0];
//        int i = 0;
//        while(i < arr.length){
//            if(arr[i] < min){
//                min = arr[i];
//            }
//            i++;
//        }
//        return min;
//    }
//}


                    // 43. check given array is sorted
// check if the given array is in ascending order or in descending order

//class twoDimentionalArray{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to check given array is sorted:");
//        System.out.println("Enter the size of the element:");
//        int size = input.nextInt();
//        int[] nums = new int[size];
//        int i = 0;
//        while(i < size){
//            System.out.println("Enter the elements of the Array:" + (i+1) + ": ");
//            nums[i] = input.nextInt();
//            i++;
//        }
//        boolean isIncr = isIncreasing(nums);
//        boolean isDecr = isDecreasing(nums);
//        if(isIncr || isDecr){
//            System.out.println("Your array are sorted:");
//        }else{
//            System.out.println("Your array are not sorted:");
//        }
//
//    }
//    public static boolean isIncreasing(int[] arr){
//        int i = 1;
//        while(i < arr.length){
//            if(arr[i] < arr[i - 1]){
//                return false;
//            }
//            i++;
//        }
//        return true;
//    }
//    public static boolean isDecreasing(int[] arr){
//        int i = 1;
//        while(i < arr.length){
//            if(arr[i] > arr[i - 1]){
//                return false;
//            }
//            i++;
//        }
//        return true;
//    }
//}


                  // 44.Check a program to return a new array deleting a specific element

//class twoDimentionalArray{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to return a new array deleting a specific element:");
//        System.out.println("Please, Enter the size of the element:");
//        int size = input.nextInt();
//        int[] nums = new int[size];
//        int i = 0;
//        while(i < size){
//            System.out.println("Enter the number of the element:" + (i+1) + ": ");
//            nums[i] = input.nextInt();
//            i++;
//        }
//        System.out.println("Please enter the specific deleting number:");
//        int numToDelete = input.nextInt();
//        int[] numArr = deleteNumber(nums, numToDelete);
//        System.out.println("Here is your new Array:");
//        int index = 0;
//        while(index < numArr.length){
//            System.out.print(numArr[index] + " ");
//            index++;
//        }
//        System.out.println();
//    }
//    public static int[] deleteNumber(int[] numArr, int numToDelete){
//        int noOfOccurence = noOfOccurence(numArr, numToDelete);
//        if(noOfOccurence == 0){
//            return numArr;
//        }
//        int size = numArr.length - noOfOccurence;
//        int[] newSize = new int[size];
//        int i = 0, j = 0;
//        while(i < numArr.length){
//            if(numArr[i] != numToDelete){
//                newSize[j] = numArr[i];
//                j++;
//            }
//            i++;
//        }
//
//        return newSize;
//    }
//    public static int noOfOccurence(int[] numArr, int num){
//        int occ = 0;
//        int i = 0;
//        while(i < numArr.length){
//            if(numArr[i] == num){
//                occ++;
//            }
//            i++;
//        }
//        return occ;
//    }
//}


                // 45. reverse an array
//class twoDimentionalArray{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to Reverse the array element:");
//        System.out.println("Enter the size of the Array:");
//        int size = input.nextInt();
//        int[] nums = new int[size];
//        int i = 0;
//        while (i < size) {
//            System.out.println("The element of the array:" + (i + 1) + (": "));
//            nums[i] = input.nextInt();
//            i++;
//        }
//        reverse(nums);
//        System.out.print("Here, the new array is:");
//        int index = 0;
//        while(index < nums.length){
//            System.out.print(nums[index] + " ");
//            index++;
//        }
//    }
//    public static void reverse(int[] arr){
//        int i = 0;
//        while(i < arr.length / 2){
//            int swap = arr[i];
//            arr[i] = arr[(arr.length - 1) - i];
//            arr[(arr.length - 1) - i] = swap;
//            i++;
//        }
//    }
//}


                 // array is palindrome or not
//class twoDimentionalArray{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to check the number is palindrome or not:");
//        System.out.println("Please, enter the size of the element:");
//        int size = input.nextInt();
//        int[] nums = new int[size];
//        int i = 0;
//        while(i < nums.length){
//            System.out.println("Enter the element of the array:" + (i+1) + ": ");
//            nums[i] = input.nextInt();
//            i++;
//        }
//        boolean isPalindrome = isPalindrome(nums);
//        if(isPalindrome){
//            System.out.println("The array is palindrome:");
//        }else {
//            System.out.println("The array is not palindrome:");
//        }
//
//    }
//    public static boolean isPalindrome(int[] arr){
//        int i = 0;
//        while(i < arr.length / 2){
//            int swap = arr[i];
//            arr[i] = arr[(arr.length - 1) - i];
//            arr[(arr.length - 1) - i] = swap;
//            if(arr[i] == arr[(arr.length - 1) - i]){
//                return true;
//            }
//            i++;
//        }
//        return false;
//    }
//}


              // merge two sorted array
//class twoDimentionalArray{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to enter the first sorted Array:");
//        System.out.println("Please enter size of first sorted array:");
//        int size = input.nextInt();
//        int[] nums1 = new int[size];
//        int i = 0;
//        while(i < size){
//            System.out.println("Enter the number of first sorted Array:" + (i+1) + ": ");
//            nums1[i] = input.nextInt();
//            i++;
//        }
//        System.out.println("Welcome, to enter the second sorted Array:");
//        System.out.println("Enter the size of sorted Array:");
//        int size2 = input.nextInt();
//        int[] nums2 = new int[size2];
//        int index = 0;
//        while(index < nums2.length){
//            System.out.println("Enter the second sorted Array:" + (index + 1) + ": ");
//            nums2[index] = input.nextInt();
//            index++;
//        }
//        int[] newArr = merge(nums1, nums2);
//        System.out.println("Here is the new sorted array");
//        int i2 = 0;
//        while(i2 < newArr.length){
//            System.out.print(newArr[i2] + " ");
//            i2++;
//        }
//    }
//        public static int[] merge(int[] arr1, int[] arr2){
//        int newSize = arr1.length + arr2.length;
//        int[] newArr = new int[newSize];
//        int i = 0, j = 0, k = 0;
//        while(i < arr1.length || j < arr2.length){
//            if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
//                newArr[k] = arr1[i];
//                i++;
//                k++;
//            }else{
//                newArr[k] = arr2[j];
//                k++;
//                j++;
//            }
//        }
//        return newArr;
//    }
//}


                    // To Search an element in 2D Array

