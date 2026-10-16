class PaymentTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Payment Processing...");
        }
    }
}

public class PaymentGateway {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new PaymentTask());
        t.start();
        t.join();
    }
}