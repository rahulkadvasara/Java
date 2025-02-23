package p1;

public class A{
    public int pub = 0;
    private int pri = 0;
    protected int pro = 0;
    int def = 0;
    
    void access(){
        System.out.println(pub);
        System.out.println(pri);
        System.out.println(pro);
        System.out.println(def);
    }
}
class B extends A{
    void access(){
        System.out.println(pub);
        // System.out.println(pri);
        System.out.println(pro);
        System.out.println(def);
    }
}
class C{
    void access(){
        A a1 = new A();
        System.out.println(a1.pub);
        // System.out.println(a1.pri);
        System.out.println(a1.pro);
        System.out.println(a1.def);
    }
}