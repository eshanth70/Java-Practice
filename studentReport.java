import java.util.Scanner;

class student{
    String name;
    int rollno;
    double marks1;
    double marks2;
    double marks3;

    student(String name, int rollno, double marks1, double marks2, double marks3) {
    this.name = name;
    this.rollno = rollno;
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;
}

    double calculateTotal(){
        return marks1 + marks2 + marks3;
    }

    double calculateAverage(){
        return calculateTotal() / 3;
    }

    String calculateGrade() {
    double average = calculateAverage();

    if (average >= 90) {
        return "A";
    } else if (average >= 80) {
        return "B";
    } else if (average >= 70) {
        return "C";
    } else if (average >= 60) {
        return "D";
    } else {
        return "F";
    }
}
    
    void displayReport(){
    System.out.println("=== STUDENT REPORT ===");
    System.out.println("Name: " + name);
    System.out.println("Roll number: " + rollno);

    System.out.println("Marks:");
    System.out.println("Subject 1: " + marks1);
    System.out.println("Subject 2: " + marks2);
    System.out.println("Subject 3: " + marks3);

    System.out.println("Total: " + calculateTotal());
    System.out.printf("Average: %.2f%n" , calculateAverage());
    System.out.println("Grade: " + calculateGrade());
    }

}

public class studentReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your roll number: ");
        int rollno = input.nextInt();

        System.out.println("Enter subject1 marks: ");
        double marks1 = input.nextFloat();

        System.out.println("Enter subject2 marks: ");
        double marks2 = input.nextFloat();

        System.out.println("Enter subject3 marks: ");
        double marks3 = input.nextFloat();

        student s1 = new student(name, rollno, marks1, marks2, marks3);

        s1.displayReport();

        input.close();
    }
}