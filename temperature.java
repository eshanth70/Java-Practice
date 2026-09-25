import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in centigrade: ");
        double temp = input.nextDouble();

        if (temp < 0) {
            System.out.println("Freezing weather");
        } else if (temp <= 10) {
            System.out.println("Very Cold weather");
        } else if (temp <= 20) {
            System.out.println("Cold weather");
        } else if (temp <= 30) {
            System.out.println("Normal in Temp");
        } else if (temp < 40) {
            System.out.println("Its Hot");
        } else {
            System.out.println("Its Very Hot");
        }

        input.close();
    }
}