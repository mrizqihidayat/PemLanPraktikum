package Interface;

public class Invoice implements Payable {
    String productName;
    Integer quantity;
    Integer pricePerItem;

    public Invoice(String productName, Integer quantity, Integer pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public String toString() {
        return  "Product Name\t: " + productName +
                "\nQuantity\t: " + quantity +
                "\nPrice Per Item\t: " + pricePerItem;
    }
}
