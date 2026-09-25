import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println("Natural numbers in reverse:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nEven numbers in reverse:");
        for (int i = n; i >= 2; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd numbers in reverse:");
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}