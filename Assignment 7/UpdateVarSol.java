class Th3 extends Thread {
    static Syn sy = new Syn();
    static int a=0;
    public void run(){
        for(int i=0;i<10000;i++){
            synchronized(sy){
                a++;
            }
        }
    }
}
class Syn{}

class UpdateVarSol{
    public static void main(String[] args) throws Exception {
        Th3 t1 = new Th3();
        Th3 t2 = new Th3();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Value of a in Th2 : "+Th3.a);
    }
}