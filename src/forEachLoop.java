import java.util.Scanner;

public class forEachLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome for each loop:");
        String[] array = new String[]{
                "Ram", "Shyam", "Mohan", "Sohan", "Sita", "Geeta"
        };
        printArrayForEach(array);
    }
    public static void printArrayForEach(String[] array){
        for(String name : array){
            System.out.println(name);
        }
    }
}
