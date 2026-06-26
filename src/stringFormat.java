public class stringFormat {
    public static void main(String[] args){
        int marks = 45;
        String name = "Aarti";
        System.out.println("Hello " + name + " your marks is " + marks);
        System.out.printf("Hello %-15S your marks is %0+15d ", name, marks);

    }
}
