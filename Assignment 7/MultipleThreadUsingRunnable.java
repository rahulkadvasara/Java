class MyTh implements Runnable{
    String name = "";
    MyTh(String n){
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
        MyTh mt1 = new MyTh("Thread 1");
        MyTh mt2 = new MyTh("Thread 2");
        
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);

        t1.start();
        t2.start();
    }
}