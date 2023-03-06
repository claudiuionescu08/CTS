public class Main2 {
    public static void main(String[] args) {
        User user = new User("John");
        PaymentManager paymentManager = new PaymentManager();
        paymentManager.doPayment(user);
    }
}
