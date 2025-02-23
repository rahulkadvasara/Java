import java.util.Scanner;

class Uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String uppercased = input.toUpperCase();
        System.out.println("Upperercase version: " + uppercased);
        scanner.close();
    }
}