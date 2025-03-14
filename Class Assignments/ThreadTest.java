class MyTh implements Runnable {
    String name = "";
    MyTh(String n) {
        name = n;
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + "-" + i);
        }
    }
}

class ThreadTest{
    public static void main(String[] args) {
        System.out.println("Main-Start");
        MyTh mt1 = new MyTh("T1");
        MyTh mt2 = new MyTh("T2");
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
        System.out.println("Main-End");
    }
}