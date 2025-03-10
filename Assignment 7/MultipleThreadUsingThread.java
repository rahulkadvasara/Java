class MyTh extends Thread{
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

class MultipleThreadUsingThread{
    public static void main(String[] args) {
        MyTh mt1 = new MyTh("Thread 1");
        MyTh mt2 = new MyTh("Thread 2");
        mt1.start();
        mt2.start();
    }
}