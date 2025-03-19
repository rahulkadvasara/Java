import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class InvalidContactException extends Exception {
    public InvalidContactException(String message) {
        super(message);
    }
}

public class EmailContactVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter email ID: ");
            String email = scanner.nextLine();
            validateEmail(email);
            
            System.out.print("Enter contact number: ");
            String contact = scanner.nextLine();
            validateContact(contact);
            
            System.out.println("Email and Contact number are valid.");
        } catch (InvalidEmailException | InvalidContactException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    public static void validateEmail(String email) throws InvalidEmailException {
        String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        if (!Pattern.matches(emailRegex, email)) {
            throw new InvalidEmailException("Invalid Email Format");
        }
    }
    
    public static void validateContact(String contact) throws InvalidContactException {
        String contactRegex = "^\\d{10}$";
        if (!Pattern.matches(contactRegex, contact)) {
            throw new InvalidContactException("Invalid Contact Number. It should be 10 digits.");
        }
    }
}
