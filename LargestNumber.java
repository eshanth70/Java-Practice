import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest = " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Largest = " + b);
        } 
        else {
            System.out.println("Largest = " + c);
        }

        input.close();
    }
}
