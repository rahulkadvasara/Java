import p1.*;
import p2.*;

public class test{
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        System.out.println("Accessing from A: ");
        a.access();

        System.out.println("Accessing from B: ");
        b.access();

        System.out.println("Accessing from C: ");
        c.access();

        System.out.println("Accessing from D: ");
        d.access();

        System.out.println("Accessing from E:");
        e.access();
    }
}