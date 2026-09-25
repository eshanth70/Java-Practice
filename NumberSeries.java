import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println("Natural numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nEven numbers:");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
