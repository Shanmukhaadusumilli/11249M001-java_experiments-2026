class OrderPlacement extends Thread {
    public void run() {
        try {
            System.out.println("Order Placement: Customer selects items...");
            Thread.sleep(1000);
            System.out.println("Order Placement: Payment confirmed...");
            Thread.sleep(1000);
            System.out.println("Order Placement: Order placed successfully!");
        } catch (InterruptedException e) {
            System.out.println("Order placement interrupted.");
        }
    }
}

class OrderDelivery extends Thread {
    public void run() {
        try {
            System.out.println("Order Delivery: Restaurant is preparing the food...");
            Thread.sleep(1000);
            System.out.println("Order Delivery: Delivery partner picked up the order...");
            Thread.sleep(1000);
            System.out.println("Order Delivery: Order delivered. Enjoy your meal!");
        } catch (InterruptedException e) {
            System.out.println("Order delivery interrupted.");
        }
    }
}

public class FoodDelivery {
    public static void main(String[] args) throws InterruptedException {
        OrderPlacement placement = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();

        placement.start();
        placement.join();   

        delivery.start();
        delivery.join();   

        System.out.println("All order processes completed.");
    }
}