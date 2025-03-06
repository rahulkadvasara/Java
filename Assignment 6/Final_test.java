class Final_ex{
    final double PI = 3.14;
    final void f(){
        System.out.println("Final Method");
    }
}

final class Final_class{
    void f2(){
        System.out.println("Final class");
    }
}

// class Final_test extends Final_ex, Final_class {

class Final_test extends Final_ex{
    public static void main(String[] args){
        // Final_ex a1 = new Final_ex();
        // a1.PI = 3.1;
        // void f(){
        //     System.out.println("Modifing Final Method");
        // }
        System.out.println("Final variable can't be modified, final method can't be overriden and final class can't be inhrited.");
    }
}
