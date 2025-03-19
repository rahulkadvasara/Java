import java.util.Scanner;

public class DigitSumDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            System.out.print("Enter a number to divide by: ");
            int divisor = scanner.nextInt();
            
            int sum = extractAndSumDigits(input);
            System.out.println("Sum of digits: " + sum);
            
            double result = (double) sum / divisor;
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    public static int extractAndSumDigits(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }
}
