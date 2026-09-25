import java.util.Scanner;
public class StudentGradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== STUDENT GRADE REPORT ===");

        System.out.println("Enter your admission number: ");
        int admissionnumber = input.nextInt();
        String[] students = {"Eshanth", "Rohit", "Rohan", "Rahul", "Daksh", "Kamal"};
        int[] admissionNumbers = {102, 101, 104, 103, 106, 105};
        
        int studentindex = -1;

        for(int j = 0; j < admissionNumbers.length; j++){
            if(admissionNumbers[j] == admissionnumber){
                studentindex = j;
                System.out.println("your name is: " + students[j]);
            }
        }

        if(studentindex == -1){
            System.out.println("Admission number not found");
            input.close();
            return;
        }

        System.out.println("Enter marks: ");
        String[] subjects = {"Java", "Math", "Physics", "English"};
        int[] marks = new int[4];

        for (int i = 0; i < subjects.length; i++) {
        System.out.print(subjects[i] + ": ");
        marks[i] = input.nextInt();

        while (marks[i] < 0 || marks[i] > 100) {
        System.out.println("Invalid input! Enter a mark between 0 and 100.");
        System.out.print(subjects[i] + ": ");
        marks[i] = input.nextInt();
    }
}
        int total = 0;

        for(int m = 0; m < marks.length; m++){
            total += marks[m];
        }


        double average = (double) total / marks.length;
        System.out.println("Average: " +  average);

        int grade = (int) average / 10;
        String gradeletter;
        
        switch (grade){
            case 9:
                gradeletter = "A";
                break;
            
            case 8:
                gradeletter = "B";
                break;

            case 7:
                gradeletter = "C";
                break;

            case 6:
                gradeletter = "D";
                break;

            case 5:
                gradeletter = "E";
                break;

            default:
                gradeletter = "F";
        }

        System.out.println("--------------------");

        System.out.println("Students: " + students[studentindex]);
        System.out.println("Total: " + total);
        System.out.println("Average: " + total / 4);
        System.out.println("Grade: " + gradeletter);
        
        System.out.println("--------------------");

        input.close();
    }
}