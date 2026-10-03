import java.util.*;

public class Manager {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<String> expense = new ArrayList<>();
        ArrayList<Double> amount = new ArrayList<>();

        System.out.println("======= TRACKER =======");
        System.out.println("1. TASKS\n"
                + "2. EXPENSES\n"
                + "3. STUDY TRACKER\n"
                + "4. HABITS\n"
                + "5. DAILY SUMMARY\n"
                + "6. EXIT");

        System.out.println("What's your vibe for today?: ");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {

            while (true) {

                System.out.println("A. Add task\n"
                        + "B. View tasks\n"
                        + "C. Complete task\n"
                        + "D. Delete task\n"
                        + "E. Exit");

                System.out.println("What do you want to do?: ");
                String choice1 = input.nextLine();

                // ADD TASK
                if (choice1.equalsIgnoreCase("A")) {

                    System.out.println("What tasks you want to add?: ");

                    while (true) {

                        String task = input.nextLine();

                        if (task.isEmpty()) {
                            break;
                        }

                        tasks.add(task);
                    }
                }

                // VIEW TASKS
                if (choice1.equalsIgnoreCase("B")) {

                    System.out.println("Your tasks are:");
                    System.out.println(tasks);
                }

                // COMPLETE TASK
                if (choice1.equalsIgnoreCase("C")) {

                    System.out.println("Choose the task you completed:");
                    String complete = input.nextLine();

                    if (tasks.remove(complete)) {
                        System.out.println("Task completed!");
                    } else {
                        System.out.println("Task not found.");
                    }
                }

                // DELETE TASK
                if (choice1.equalsIgnoreCase("D")) {

                    System.out.println("Choose the task you want to delete:");
                    String delete = input.nextLine();

                    if (tasks.remove(delete)) {
                        System.out.println("Task deleted!");
                    } else {
                        System.out.println("Task not found.");
                    }
                }

                // EXIT
                if (choice1.equalsIgnoreCase("E")) {
                    break;
                }
            }
        }

        if(choice == 2){

            while(true){

                System.out.println("A. Add expense\n"
                    + "B. View expenses\n"
                    + "C. Calculate total\n"
                    + "D. Find highest expense\n"
                    + "E. Exit");
                
                System.out.println("What do you want to do?: ");
                String choice2 = input.nextLine();

                // ADD EXPENSE
                if(choice2.equalsIgnoreCase("A")){
                    System.out.println("Enter the expense name: ");

                    System.out.println("Enter amount: ");

                    while (true) {

                        String expenses = input.nextLine();

                        if (expenses.isEmpty()){
                            break;
                        }

                        expense.add(expenses);

                        String amountInput = input.nextLine();

                        if(amountInput.isEmpty()){
                            break;
                        }

                        double amounts = Double.parseDouble(amountInput);

                        amount.add(amounts);
                    }
                }

                if(choice2.equalsIgnoreCase("B")){
                    System.out.println("Your expense name is: ");
                    System.out.println(expense);

                    System.out.println("The amount is: ");
                    System.out.println(amount);

                }

                if(choice2.equalsIgnoreCase("C")){
                    int sum = 0;
                    System.out.println("The total money spent is: ");
                    for(int i = 0; i < amount.size(); i++){
                        sum += amount.get(i);
                    }

                    System.out.println(sum);
                }
                

                if(choice2.equalsIgnoreCase("D"));
                


            }
        }
    }
}