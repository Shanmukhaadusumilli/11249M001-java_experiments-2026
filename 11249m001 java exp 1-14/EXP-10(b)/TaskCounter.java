class CounterThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000);   // 1-second delay
            } catch (InterruptedException e) {
                System.out.println("Counter interrupted.");
                return;
            }
        }
    }
}

public class TaskCounter {
    public static void main(String[] args) throws InterruptedException {
        CounterThread t = new CounterThread();
        t.start();
        t.join();
        System.out.println("Counting finished.");
    }
}