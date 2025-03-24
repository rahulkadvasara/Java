class T extends Thread{
    String name = "";
    T(String n){
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
        T mt1 = new T("Thread 1");
        T mt2 = new T("Thread 2");
        mt1.start();
        mt2.start();
    }
}