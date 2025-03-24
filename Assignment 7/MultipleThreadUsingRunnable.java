class MyTh2 implements Runnable{
    String name = "";
    MyTh2(String n){
        name = n;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(name+" : "+i);
        }
    }
}

class MultipleThreadUsingRunnable{
    public static void main(String[] args) {
        MyTh2 mt1 = new MyTh2("Thread 1");
        MyTh2 mt2 = new MyTh2("Thread 2");
        
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);

        t1.start();
        t2.start();
    }
}