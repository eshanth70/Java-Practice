import java.util.Scanner;
import java.util.Arrays;

    class Student{
    String name;
    int id;
    String branch;

    Student(String name, int id, String branch){

    this.name = name;
    this.id = id;
    this.branch = branch;
        
    }

    void display(){
    System.out.println("Student name: " + name);
    System.out.println("Student id: " + id);
    System.out.println("Student branch: " + branch);
    }
 }
 public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Student s1 = new Student(
        "VIJAY",
        101,
        "CSE");

        s1.display();
        
        scanner.close();
    }
}

