class StaticNonstatic {
    String ns = "Non Static variable";
    static String s = "Static variable";
    void f1(){
        System.out.println(ns);
        System.out.println(s);
    }
    static void f2(){
        System.out.println(s);
        // System.out.println(ns);
        System.out.println("Accessing Nonstatic variable from static function : ");
        StaticNonstatic a1 = new StaticNonstatic();
        System.out.println(a1.ns);
    }
}

class StaticNonstatic_test{
    public static void main(String[] args){
        System.out.println("Accessing Static function : ");
        StaticNonstatic.f2();
        System.out.println("Accessing Nonstatic function : ");
        StaticNonstatic a2 = new StaticNonstatic();
        a2.f1();
    }
}
