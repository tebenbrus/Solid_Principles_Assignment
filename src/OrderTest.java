public class OrderTest {

    public static void main(String[] args) {
        OrderCalculator calculator = new BasicOrderCalculator();
        OrderProcessor processor = new SimpleOrderProcessor();
        NotificationService notificationService = new EmailNotificationService();

        double total = calculator.calculateTotal(10.0, 2);
        System.out.println("Order total: $" + total);

        processor.placeOrder("John Doe", "123 Main St");
        notificationService.sendNotification("johndoe@example.com");
    }
}