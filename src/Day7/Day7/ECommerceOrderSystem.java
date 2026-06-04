package Day7.Day7;
class Order {
    int orderId;
    String customerName;
    String productName;
    int quantity;
    private double pricePerItem;

    Order(int orderId, String customerName, String productName,
          int quantity, double pricePerItem) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    double calculateTotal() {
        return quantity * pricePerItem;
    }

    double applyDiscount() {
        double total = calculateTotal();

        if (total > 10000) {
            total = total - (total * 0.20);
        } else if (total > 5000) {
            total = total - (total * 0.10);
        }

        return total;
    }
}

public class ECommerceOrderSystem {
    public static void main(String[] args) {

        Order o1 = new Order(101, "Sonali", "Laptop", 2, 6000);

        System.out.println("Order ID: " + o1.orderId);
        System.out.println("Customer Name: " + o1.customerName);
        System.out.println("Product Name: " + o1.productName);
        System.out.println("Quantity: " + o1.quantity);
        System.out.println("Final Amount: " + o1.applyDiscount());
    }
}
