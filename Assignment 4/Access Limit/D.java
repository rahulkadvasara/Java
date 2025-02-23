package p2;
import p1.A;

public class D extends A{
    void access(){
        System.out.println(pub);
        System.out.println(pri);
        System.out.println(pro);
        System.out.println(def);
    }
}
class E{
    void access(){
        A a1 = new A();
        System.out.println(a1.pub);
        System.out.println(a1.pri);
        System.out.println(a1.pro);
        System.out.println(a1.def);
    }
}