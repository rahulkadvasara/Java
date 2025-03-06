import java.util.Scanner;

class StringDiv{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int n = 5;
        int str_num = 0;
        int div = 0;

        try{
            str_num = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            System.out.println("String is not a number");
        }

        try{
            div = str_num/n;
            System.out.println("Division: " + div);
        }catch(ArithmeticException ae){
            System.out.println("Division by zero is not possible");
        }
        
        sc.close();
    }
}