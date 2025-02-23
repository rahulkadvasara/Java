import java.util.ArrayList;

class ArrOperations {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19, 21, 4, 6, 8};

        // 1. Reverse the array
        reverseArray(arr);

        // 2. Print even and odd numbers separately
        printEvenAndOddNumbers(arr);

        // 3. Find minimum
        int min = findMinimum(arr);
        System.out.println("Minimum: " + min);

        // 4. Find maximum
        int max = findMaximum(arr);
        System.out.println("Maximum: " + max);

        // 5. Print prime numbers
        printPrimeNumbers(arr);
    }

    public static void reverseArray(int[] arr) {
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printEvenAndOddNumbers(int[] arr) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void printPrimeNumbers(int[] arr) {
        System.out.print("Prime Numbers: ");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}