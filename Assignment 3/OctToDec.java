import java.util.Scanner;

class OctToDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();
        
        try {
            int decimal = Integer.parseInt(octalString, 8);
            System.out.println("The decimal equivalent is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number.");
        }
        
        scanner.close();
    }
}