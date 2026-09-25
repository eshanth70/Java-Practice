import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number greater than 100: ");
            int num = input.nextInt();
            int originalNum = num;
            int reversedNum = 0;

            while (num > 0) {
                int lastDigit = num % 10;
                reversedNum = (reversedNum * 10) + lastDigit;
                num = num / 10;
            }

            if (originalNum == reversedNum) {
                System.out.println(originalNum + " is a palindrome.");
            } else {
                System.out.println(originalNum + " is not a palindrome.");
            }
        }
    }
}