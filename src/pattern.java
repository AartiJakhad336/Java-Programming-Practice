//public class pattern {
//    public static void main(String[] args) {
//        System.out.println("*\n**\n***\n****\n*****\n");
//        System.out.println("*****\n****\n***\n**\n*\n");
//        System.out.println("    *\n   **\n  ***\n ****\n*****");
//    }
//}



//public class pattern {
//    public static void main(String[] args) {
//        System.out.println("*\n**\n***\n****\n*****\n");
//        System.out.println("*****\n****\n***\n**\n*\n");
//        System.out.println("    *\n   **\n  ***\n ****\n*****");
//    }
//}


//                    * * * * *
//                    * * * * *
//                    * * * * *

import java.util.Scanner;

//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        for(int i=1;i<=row;i++){ // kitni lines hogi
//            for(int j=1;j<=col;j++){ // hr line mai kitne star print hoge
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }
//    }
//}



//Jitne row utne column     * * * *
//                          * * * *
//                          * * * *
//                          * * * *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


//            1 2 3 4          1 2 3
//            1 2 3 4          1 2 3
//            1 2 3 4          1 2 3

//class printer{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}


//           A B C D          A B C
//           A B C D          A B C
//           A B C D          A B C
//           A B C D

//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print((char)(j+64) + " ");
//            }
//            System.out.println();
//        }
//    }
//}


//            a b c d     Alphabet Square 2
//            a b c d
//            a b c d
//            a b c d
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print((char)(j+96) + " ");
//            }
//            System.out.println();
//        }
//    }
//}


// Number Square 2      1 1 1 1
//                      2 2 2 2
//                      3 3 3 3
//                      4 4 4 4

//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//    }
//}


// ALphabet Square 3            A A A A
//                              B B B B
//                              C C C C
//                              D D D D

//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print((char)(i+64) + " ");
//            }
//            System.out.println();
//        }
//    }
//}


// Alphabet Square 4     a a a a
//                       B B B B
//                       c c c c
//                       D D D D
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i+=2){
//            for(int j=1;j<=n;j++){
//                System.out.print((char)(i+96) + " ");
//            }
//            System.out.println();
//            for(int k=1;k<=n;k++){
//                System.out.print((char)(i+ 65) + " ");
//            }
//            System.out.println();
//        }
//    }
//}


// Alphabet Square 4     a a a a               a a a
//                       B B B B               B B B
//                       c c c c               c c c
//                       D D D D
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i % 2 == 0){
//                    System.out.print((char)(i+64) + " ");
//                }else{
//                    System.out.print((char)(i+96) + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


// Star Triangle               *                       *
//                             * *                     * *
//                             * * *                   * * *
//                             * * * *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* " + " ");
//            }
//            System.out.println();
//        }
//    }
//}


// Number triangle              1
//                              1 2
//                              1 2 3
//                              1 2 3 4
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


// For Alphabet Triangle      A
//                            A B
//                            A B C
//                            A B C D
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print((char)(j+64)+ " ");
//            }
//            System.out.println();
//        }
//    }
//}


// A
// B B
// C C C
// D D D D
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print((char)(i + 64) + " ");
//            }
//            System.out.println();
//        }
//    }
//}


//  ALPHANUMERICAL TRIANGLE     1
//                              A B
//                              1 2 3
//                              A B C D
//                              1 2 3 4 5
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(i % 2== 0){
//                    System.out.print((char)(j+64) + " ");
//                }else{
//                    System.out.print(j + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


// Star Triangle Horizontally Flipped   * * * *
//                                      * * *
//                                      * *
//                                      *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//    }
//}

// second method
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =1;i<=n;i++){
//            for(int j=n;j>=i;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//    }
//}

// Third method
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =1;i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//    }
//}


// Number Triangle Horizontally Flipped    1 2 3 4
//                                         1 2 3
//                                         1 2
//                                         1
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}


// Alphabet Triangle Horizontally flipped  a b c d
//                                         a b c
//                                         a b
//                                         a
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print((char)(j+96) + " ");
//            }
//            System.out.println();
//        }
//    }
//}


// A A A A
// B B B
// C C
// D
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=n;j>=i;j--){
//                System.out.print((char)(i+64) + " ");
//            }
//            System.out.println();
//        }
//    }
//}


// Hollow Rectangle   *  *  *  *  *  *  *
//                    *                 *
//                    *                 *
//                    *                 *
//                    *  *  *  *  *  *  *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(i==1 || i==n || j==1 || j==m)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
//    }
//}



//        *
//        *
//    * * * * *
//        *
//        *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int mid = n / 2 + 1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==mid || j==mid)  System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
//    }
//}


// *       *
//   *   *
//     *
//   *   *
// *       *

// phele baat toh ye ek square hai
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==j || i+j == n+1){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


// 1
// 2 3
// 4 5 6
// 7 8 9 10
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(a + " ");
//                a++;
//            }
//            System.out.println();
//        }
//    }
//}



// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if((i+j) % 2 == 0){
//                    System.out.print("1 ");
//                }else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


// 1
// 1 3
// 1 3 5
// 1 3 5 7
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
////        int a = 1;
//        for(int i=1;i<=n;i++){
//            int a = 1;
//            for(int j=1;j<=i;j++){
//                System.out.print(a + " ");
//                a+=2;
//            }
//            System.out.println();
//        }
//    }
//}


//        *
//      * *
//    * * *                      method 1
//  * * * *
//* * * * *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if((i+j) > n){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}



//        *
//      * *
//    * * *                      method 2
//  * * * *
//* * * * *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int k=1;k<=n-i;k++) {
//                System.out.print("  ");
//            }
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//        }
//    }
//}


//       1
//     1 2
//   1 2 3
// 1 2 3 4
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int k=1;k<=n-i;k++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}




//       A
//     B B
//   C C C
// D D D D
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int k=1;k<=n-i;k++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print((char)(i+64) + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//       * * * *
//     * * * *
//   * * * *
// * * * *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int k=1;k<=n-i;k++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


// * * * * *
//   * * * *
//     * * *
//       * *
//         *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=2;j<=i;j++){
//                System.out.print("  ");
//            }
//            for(int j=n;j>=i;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}




//           *
//         * * *
//       * * * * *
//     * * * * * * *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=0;i<n;i++){
//            for(int k=1;k<=n-i-1;k++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=2*i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


//           *
//         * * *
//       * * * * *           method 2
//     * * * * * * *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int nsp = n-1, nst = 1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=nsp;j++){
//                System.out.print("  ");
//            }
//            for(int k=1;k<=nst;k++){
//                System.out.print("* ");
//            }
//            nsp--;
//            nst+=2;
//            System.out.println();
//        }
//    }
//}


//           *
//         * * *
//       * * * * *
//     * * * * * * *
//       * * * * *
//         * * *
//           *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int nsp = n-1,nst =1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=nsp;j++){
//                System.out.print("  ");
//            }
//            for(int k=1;k<=nst;k++){
//                System.out.print("* ");
//            }
//            nsp--;
//            nst+=2;
//            System.out.println();
//        }
//        nsp = 1;
//        nst = 2*n-3;
//        for(int i=1;i<=n-1;i++){
//            for(int j=1;j<=nsp;j++){
//                System.out.print("  ");
//            }
//            for(int k=1;k<=nst;k++){
//                System.out.print("* ");
//            }
//            nsp++;
//            nst -= 2;
//            System.out.println();
//        }
//    }
//}


//  * * * * * * * * *
//  * * * *   * * * *
//  * * *       * * *
//  * *           * *
//  *               *
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int nsp =1;
//        for(int t=1;t<=2*n-1;t++){
//            System.out.print("* ");
//        }
//        System.out.println();
//        for(int i=1;i<=n-1;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print("* ");
//            }
//            for(int k=1;k<=nsp;k++){
//                System.out.print("  ");
//
//            }
//            nsp+=2;
//            for(int j=1;j<=n-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}



// 1 1 1 1 1 1 1
// 1 2 2 2 2 2 1
// 1 2 3 3 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 3 3 2 1
// 1 2 2 2 2 2 1
// 1 1 1 1 1 1 1
//class pattern{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=2*n-1;i++){
//            for(int j=1;j<=2*n-1;j++){
//                int a =i, b = j;
//                if(i>n) a = 2*n-i;
//                if(j>n) b = 2*n-j;
//                System.out.print(Math.min(a,b) + " ");
//            }
//            System.out.println();
//        }
//    }
//}


