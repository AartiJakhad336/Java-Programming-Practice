public class parameter {
    public static void main(String[] args) {
        int num = sumTwoNumber(3,7);   //jb actual value pass ki jati hai toh use bolte hain arguments
        System.out.println(num);  // System.out.println(sumTwoNumber(3,7));isko hmm ese bhii likh skte hain
    }
    public static int sumTwoNumber(int first, int second){  // jb defination define ki jati hai use bolte hain parameter
        System.out.println("First number received:" + first);
        System.out.println("Second number received:" + second);
        int sum = first + second;
        return sum;  // return first + second;


    }
}
