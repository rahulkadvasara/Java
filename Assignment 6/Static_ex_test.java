class Static_ex{
    static String s = "Accessing Static variable.";
    static void f(){
        System.out.println("Accessing Static method.");
    }
}

public class Static_ex_test extends Static_ex{
    public static void main(String[] args) {
        System.out.println(Static_ex.s);
        Static_ex.f();
    }
}