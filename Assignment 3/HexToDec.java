import java.util.Scanner;

class HexToDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine();
        
        try {
            int decimal = Integer.parseInt(hex, 16);
            System.out.println("The decimal equivalent is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid hexadecimal number.");
        }
        
        scanner.close();
    }
}