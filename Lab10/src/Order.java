import java.time.LocalDate;

public class Order {
    private int orderId;
    private String customerName;
    private LocalDate orderDate;
    private String status;
    private  double amount;
    public Order(int orderId, String customerName, LocalDate orderDate, String status, double amount){
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.status = status;
        this.amount = amount;
    }
    public int getOrderId(){
        return orderId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public String getStatus() {
        return status;
    }
    public double getAmount() {
        return amount;
    }
    @Override
    public String toString(){
        return  "Заказ [" + "ID заказа=" + orderId + ", имя клиента='" + customerName + '\'' + ", дата заказа=" +
                orderDate + ", статус='" + status + '\'' + ", количество=" + amount + ']';
    }
}