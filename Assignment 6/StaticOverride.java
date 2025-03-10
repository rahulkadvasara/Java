class StaticOverrideEx{
    static void f(){
        System.out.println("Static Method");
    }
}

class StaticOverride extends StaticOverrideEx{
    static void f(){
        System.out.println("Overriden Static Method");
    }
    public static void main(String[] args){
        StaticOverrideEx.f();
        StaticOverride.f();
    }
}