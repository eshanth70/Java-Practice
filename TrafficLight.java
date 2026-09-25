import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter traffic light colour (R/Y/G): ");
        char colour = input.next().charAt(0);

        switch (colour) {
            case 'R':
                System.out.println("The light is RED. STOP.");
                break;

            case 'Y':
                System.out.println("The light is YELLOW. PREPARE TO STOP.");
                break;

            case 'G':
                System.out.println("The light is GREEN. PROCEED.");
                break;

            default:
                System.out.println("Invalid input.");
        }

        input.close();
    }
}