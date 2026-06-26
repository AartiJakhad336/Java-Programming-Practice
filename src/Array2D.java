// Create a program to search an 2D Array
import java.util.*;
//public class Array2D {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to search 2D Array:");
//        System.out.println("Please, enter the number of rows:");
//        int rows = input.nextInt();
//        System.out.println("Please, enter the number of columns:");
//        int column = input.nextInt();
//        int[][] numArr = new int[rows][column];
//        int i = 0;
//        while(i < rows){
//            int j = 0;
//            while(j < column){
//                System.out.println("Enter the element of the rows:" + (i+1)
//                       + ", Column: " + (j+1) + " :");
//                numArr[i][j] = input.nextInt();
//                j++;
//            }
//            i++;
//        }
//        System.out.println("Enter, the number those you want to search:");
//        int num = input.nextInt();
//        boolean isFound = search(numArr, num);
//        if(isFound){
//            System.out.println("The number is Found:");
//        }else{
//            System.out.println("The number is not Found:");
//        }
//    }
//    public static boolean search(int[][] numArr, int num){
//        int i = 0;
//        while(i < numArr.length){
//            int j = 0;
//            while(j < numArr[i].length){
//                if(numArr[i][j] == num){
//                    return true;
//                }
//                j++;
//            }
//            i++;
//        }
//        return false;
//    }
//}

                 // sum and average of the element in 2D array
//public class Array2D{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome, to sum and average of 2D Array:");
//        System.out.println("Enter, the number of rows:");
//        int rows = input.nextInt();
//        System.out.println("Enter, the number of Columns:");
//        int column = input.nextInt();
//        int[][] numArr = new int[rows][column];
//        int i = 0;
//        while(i < numArr.length){
//            int j = 0;
//            while(j < numArr[i].length){
//                System.out.println("Enter, the element of the Array:" + (i+1)
//                + ", Columns:" + (j+1) + " :");
//                numArr[i][j] = input.nextInt();
//                j++;
//            }
//            i++;
//        }
//        long sum = sum(numArr);
//        double avg = average(numArr);
//        System.out.println("The sum of the Array is:" + sum);
//        System.out.println("The average of the Array is:" + avg);
//    }
//    public static long sum(int[][] numArr){
//        long sum = 0;
//        int i = 0;
//        while(i < numArr.length){
//            int j = 0;
//            while(j < numArr[i].length){
//                sum += numArr[i][j];
//                j++;
//            }
//            i++;
//        }
//        return sum;
//    }
//    public static double average(int[][] numArr){
//        if(numArr.length == 0){
//            return 0;
//        }
//        int rows = numArr.length;
//        int coln = numArr.length;
//        double size = rows * coln;
//        return sum(numArr) / size;
//    }
//}


                    // the sum of two Diagonal in 2D array
//public class Array2D{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to sum of two diagonal:");
//        System.out.println("Enter, the number of rows:");
//        int rows = input.nextInt();
//        System.out.println("Enter, the number of the Column:");
//        int column = input.nextInt();
//        int[][] numArr = new int[rows][column];
//        int i = 0;
//        while(i < numArr.length){
//            int j = 0;
//            while(j < numArr[i].length){
//                System.out.println("Enter, the element of the rows:" + (i+1)
//                + ", Columns:" + (j+1));
//                numArr[i][j] = input.nextInt();
//                j++;
//            }
//            i++;
//        }
//        long sumOfDiag = sumOfDiagonal(numArr);
//        System.out.println("The sum of the Diagonal is:" + sumOfDiag);
//    }
//    public static long sumOfDiagonal(int[][] numArr){
//        long leftDiagonal = sumOfLeftDiaginal(numArr);
//        long rightDiagonal = sumOfRightDiagonal(numArr);
//        long sum = leftDiagonal + rightDiagonal;
//        if(numArr.length % 2 != 0){
//            int ind = numArr.length / 2;
//            sum -= numArr[ind][ind];
//        }
//        return sum;
//    }
//    public static long sumOfLeftDiaginal(int[][] numArr){
//        long sum = 0;
//        int i = 0;
//        while(i < numArr.length){
//            sum += numArr[i][i];
//            i++;
//        }
//        return sum;
//    }
//    public static long sumOfRightDiagonal(int[][] numArr){
//        long sum = 0;
//        int i = 0;
//        while(i < numArr.length){
//            int coln = numArr.length - 1 - i;
//            sum += numArr[i][coln];
//            i++;
//        }
//        return sum;
//    }
//}

