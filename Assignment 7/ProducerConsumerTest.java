class SharedResource {
    private int data;
    private boolean isProduced = false;

    public synchronized void produce(int value) {
        while (isProduced) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        data = value;
        System.out.println("Produced: " + value);
        isProduced = true;
        notify();
    }

    public synchronized void consume() {
        while (!isProduced) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println("Consumed: " + data);
        isProduced = false;
        notify();
    }
}

class Producer extends Thread {
    private final SharedResource resource;
    public Producer(SharedResource resource) { this.resource = resource; }
    public void run() { for (int i = 1; i <= 5; i++) resource.produce(i); }
}

class Consumer extends Thread {
    private final SharedResource resource;
    public Consumer(SharedResource resource) { this.resource = resource; }
    public void run() { for (int i = 1; i <= 5; i++) resource.consume(); }
}

public class ProducerConsumerTest {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        new Producer(resource).start();
        new Consumer(resource).start();
    }
}
