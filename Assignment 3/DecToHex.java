import java.util.Scanner;

class DecToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal: " + hex);
        scanner.close();
    }
}