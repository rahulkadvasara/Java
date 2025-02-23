import java.util.Scanner;
import java.util.HashSet;

class UniqueDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        
        System.out.println("Numbers with unique digits in the range:");
        for (int i = start; i <= end; i++) {
            if (hasUniqueDigits(i)) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
    
    private static boolean hasUniqueDigits(int number) {
        HashSet<Character> digits = new HashSet<>();
        String numStr = Integer.toString(number);
        
        for (char digit : numStr.toCharArray()) {
            if (!digits.add(digit)) {
                return false;
            }
        }
        
        return true;
    }
}