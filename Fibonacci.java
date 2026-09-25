import java.util.Scanner;

public class Fibonacci {
    
    public static void printFibonacci(int n) {
        int first = 0;
        int second = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        input.close();
        
        printFibonacci(n);
    }
}


