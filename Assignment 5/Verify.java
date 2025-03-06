import java.util.Scanner;

class MobException extends Exception {
    public String toString() {
        return "Mobile Number is Invalid";
    }
}

class EmailException extends Exception {
    public String toString() {
        return "Email is Invalid";
    }
}

class Check {
    void checkMob(String no) throws MobException {
        if (no.length() != 10) {
            throw new MobException();
        }
        try {
            Long.parseLong(no);
        } catch (NumberFormatException nfe) {
            throw new MobException();
        }
    }

    void checkEmail(String email) throws EmailException {
        if (email.indexOf('@') == -1 || email.indexOf('.') == -1 || email.indexOf('@') > email.indexOf('.')) {
            throw new EmailException();
        }
    }
}

public class Verify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Check c = new Check();
        
        System.out.println("Enter Mobile Number: ");
        String mob = sc.nextLine();
        
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        
        try {
            c.checkMob(mob);
            System.out.println("Mobile number is Valid");
            c.checkEmail(email);
            System.out.println("Email is Valid");
        } catch (MobException me) {
            System.out.println(me);
        } catch (EmailException ee) {
            System.out.println(ee);
        } finally {
            sc.close();
        }
    }
}