import java.util.Scanner;

class Palindrome {

    // Iterative method to check if a string is a palindrome
    public static boolean isPalindromeIterative(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindromeRecursive(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindromeRecursive(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        // Check using iterative method
        if (isPalindromeIterative(str)) {
            System.out.println(str + " is a palindrome (Iterative)");
        } else {
            System.out.println(str + " is not a palindrome (Iterative)");
        }

        // Check using recursive method
        if (isPalindromeRecursive(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome (Recursive)");
        } else {
            System.out.println(str + " is not a palindrome (Recursive)");
        }
    }
}