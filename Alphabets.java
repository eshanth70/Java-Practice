public class Alphabets {
    public static void main(String[] args) {

        System.out.println("Lowercase a to z:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nUppercase A to Z:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nLowercase z to a:");
        for (char ch = 'z'; ch >= 'a'; ch--) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nUppercase Z to A:");
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
    }
}
