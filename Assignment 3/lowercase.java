import java.util.Scanner;

class Lowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String lowercased = input.toLowerCase();
        System.out.println("Lowercase version: " + lowercased);
        scanner.close();
    }
}