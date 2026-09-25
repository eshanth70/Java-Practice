import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = input.nextDouble();

        double hra, da, gross;

        if (basic <= 10000) {
            hra = basic * 0.20;
            da = basic * 0.80;
        } 
        else if (basic <= 20000) {
            hra = basic * 0.25;
            da = basic * 0.90;
        } 
        else {
            hra = basic * 0.30;
            da = basic * 0.95;
        }

        gross = basic + hra + da;

        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Gross Salary = " + gross);

        input.close();
    }
}
