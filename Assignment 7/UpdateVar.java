class Var{
    static int a=0;
}
class Th extends Thread {
    public void run(){
        for(int i=0;i<10000;i++){
            Var.a++;
        }
    }
}

class UpdateVar{
    public static void main(String[] args) {
        Th t1 = new Th();
        Th t2 = new Th();
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