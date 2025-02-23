import java.util.Scanner;

class DecToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("The octal representation of " + decimal + " is: " + octal);
        scanner.close();
    }
}