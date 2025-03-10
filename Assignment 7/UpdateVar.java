class Var{
    static int a=0;
}

class Th1 extends Thread {
    Var Var = new Var();
    public void run(){
        for(int i=0;i<10000;i++){
            Var.a++;
        }
        // System.out.println("Value of a in Th1 : "+Var.a);
    }
}

class Th2 extends Thread {
    Var Var = new Var();
    public void run(){
        for(int i=0;i<10000;i++){
            Var.a++;
        }
        // System.out.println("Value of a in Th2 : "+Var.a);
    }
}

class UpdateVar{
    public static void main(String[] args) {
        Th1 t1 = new Th1();
        Th2 t2 = new Th2();
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Value of a in Th2 : "+Var.a);
    }
}