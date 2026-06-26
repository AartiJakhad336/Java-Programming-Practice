//70. Define a student class with fields like name and age, and use toString to
// print student details

//class StringQues {
//    String name;
//    int age;
//    String rollNumber;
//    String house;
//
//    public StringQues(String name, int age, String rollNumber, String house){
//        this.name = name;
//        this.age = age;
//        this.rollNumber = rollNumber;
//        this.house = house;
//    }
//
//    @Override
//    public String toString() {
//        return "Student details:{name:"+ name
//                + ", age:"+ age +", "
//                + "rollNumber:" + rollNumber
//                +", house:"+ house +"}";
//    }
//    public static void main(String[] args){
//        StringQues sub = new StringQues("Aarti", 22,
//                "CSAI204", "Sibling");
//        System.out.println(sub);
//    }
//}


// 71. Concatenate and Convert: Take two strings, concatenate them, and convert
// the result into upper case

//public class StringQues{
//    public static void main(String[] args){
//        String firstName = "Aarti";
//        String lastName = "Jakhad";
//        String fullName = firstName.concat(" ").concat(lastName);
//        System.out.println(fullName.toUpperCase());
//    }
//}


// 72. the area of circumference of a circle for a given radius
// using Math.PI

//import java.util.Scanner;
//
//public class StringQues{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome, to area of a circle:");
//        System.out.println("Enter the radius of the circle:");
//        int radius = sc.nextInt();
//        System.out.println(Math.PI * radius * radius);
//    }
//}
//
//import java.util.Scanner;
//
//class StringQues{
//    double radiusInMm;
//
//    StringQues(double radiusInMm){
//        this.radiusInMm = radiusInMm;
//    }
//
//    double getCircumference() {
//        return 2 * radiusInMm * Math.PI;
//    }
//    double getArea(){
//        return Math.PI * Math.pow(radiusInMm, 2);
//    }
//
//    @Override
//    public String toString() {
//        return "Circle props:{radiusInMm:"+ radiusInMm
//                +", getCircumference in Mm:"+ getCircumference()
//                +", getArea in Mm2:"+ getArea() +"}";
//    }
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to the world of the circles:");
//        System.out.println("Enter the radius of the circle");
//        double radius = input.nextInt();
//        StringQues circle = new StringQues(radius);
//        System.out.println(circle);
//    }
//}



// 73. Simulate a dice roll using Math.random() and display the outcome
// (1 to 6)

//class Dice{
//    int roll (){
//        double random = Math.random() * 6;
//        return (int)Math.ceil(random);
//    }
//    public static void main(String[] args){
//        Dice dice = new Dice();
//        for(int i= 0;i<100;i++){
//            System.out.println(dice.roll());
//       }
//   }
//}


// 74. Create a number guessing game where the program select a
// random number, and the user has to guess it.

//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//class GuessingGame {
//
//    int random;
//
//    GuessingGame(){
//        random = (int) Math.ceil(Math.random() * 100);
//
//    }

    // guessing number that player guess the number
    // if guessing number is smaller to the random - negative
    // if guessing number is correct - 0
    // if guessing number is greater than random - positive
//
//        int guess(int guessNumber) {
//            return guessNumber - random;
//        }
//
//        public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        GuessingGame game = new GuessingGame();
//        System.out.println("Welcome to guessing game:");
//        int guess;
//        int result;
//        do{
//            System.out.println("Enter the guess number:");
//            guess = input.nextInt();
//            result = game.guess(guess);
//            if(result == 0){
//                System.out.println("Your guessing number is correct:");
//            }else if(result < 0){
//                System.out.println("Please, guess higher:");
//            }else{
//                System.out.println("Please, guess lower:");
//            }
//        }while(result != 0);
//    }
//}



// 75. Take an array of words and concatenate them into a single string using a
// STRINGBUILDERS

//class arrToString {
//    public static void main(String[] args) {
//        String[] arr = new String[]{"This", "is", "the", "best", "and",
//                "most", "detailed", "course", "on", "the", "java",
//                "on", "the", "internet"};
//        StringBuilder sb = new StringBuilder();
//        for (String str : arr){
//            sb.append(str).append(" ");
//        }
//        System.out.print(sb);
//
//    }
//}


// 76. Create an object with final fields and a constructor
// to initialize them

class CarFinal{
    final int noOfWheels;
    final String model;
    final String engineInLiters;

    CarFinal(int noOfWheels, String model, String engineInLiters){
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLiters = engineInLiters;
    }
}