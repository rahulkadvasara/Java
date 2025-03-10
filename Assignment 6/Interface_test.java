interface I{
    int a=5;
    public void f1();
}

interface J{
    int b=10;
    public void f2();
}

interface K extends I,J{
    int c=15;
    public void f3();
}

class Interface_test implements K{
    public static void main(String[] args) {
        System.out.println("Variable Interface I:"+I.a);
        System.out.println("Variable Interface J:"+J.b);
        System.out.println("Variable Interface K:"+K.c);
        
        Interface_test a = new Interface_test();
        a.f1();
        a.f2();
        a.f3();
    }

    public void f1(){
        System.out.println("Method of Interface I");
    }

    public void f2(){
        System.out.println("Method of Interface J");
    }

    public void f3(){
        System.out.println("Method of Interface K");
    }
}