import java.util.Scanner;

class BinToDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        
        try {
            int decimal = Integer.parseInt(binaryString, 2);
            System.out.println("The decimal equivalent is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number.");
        }
        
        scanner.close();
    }
}