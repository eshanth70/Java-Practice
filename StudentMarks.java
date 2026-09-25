import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks of 5 subjects: ");

        int m1 = input.nextInt();
        int m2 = input.nextInt();
        int m3 = input.nextInt();
        int m4 = input.nextInt();
        int m5 = input.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);

        if (average >= 90) {
            System.out.println("Grade = A");
        } else if (average >= 80) {
            System.out.println("Grade = B");
        } else if (average >= 70) {
            System.out.println("Grade = C");
        } else if (average >= 60) {
            System.out.println("Grade = D");
        } else {
            System.out.println("Grade = F");
        }

        input.close();
    }
}