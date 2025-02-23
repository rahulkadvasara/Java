// Single level inheritance
class A{
    void a(){
        System.out.println("A");
    }
}
class B extends A{
    void b(){
        System.out.println("B");
    }
}

// Multi level inheritance
class C{
    void c(){
        System.out.println("C");
    }
}
class D extends C{
    void d(){
        System.out.println("D");
    }
} 
class E extends D{
    void e(){
        System.out.println("E");
    }
}

// Hierarchical inheritance
class F{
    void f(){
        System.out.println("F");
    }
}
class G extends F{
    void g(){
        System.out.println("G");
    }
}
class H extends F{
    void h(){
        System.out.println("H");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Single level inheritance
        B b = new B();
        b.a();
        b.b();

        // Multi level inheritance
        E e = new E();
        e.c();
        e.d();
        e.e();

        // Hierarchical inheritance
        G g = new G();
        g.f();
        g.g();

        H h = new H();
        h.f();
        h.h();
    }
}