import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class OrderManagement {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(1, "Наталья", LocalDate.of(2021, 11, 10), "PENDING", 200.75),
                new Order(2, "Екатерина", LocalDate.of(2021, 11, 13), "SHIPPED", 500.00),
                new Order(3, "Георгий", LocalDate.of(2021, 11, 15), "DELIVERED", 90.70),
                new Order(4, "Никита", LocalDate.of(2021, 11, 18), "PENDING", 600.00),
                new Order(5, "Алина", LocalDate.of(2021, 11, 19), "SHIPPED", 145.00),
                new Order(6, "Вениамин", LocalDate.of(2021, 11, 27), "SHIPPED", 650.00)
        );
        LocalDate filterDate = LocalDate.of(2021, 11, 15);
        List<Order> ordersAfterDate = orders.stream() //Заказы после определенной даты, stream превр. список в поток данных
                .filter(order -> order.getOrderDate().isAfter(filterDate))
                .collect(Collectors.toList()); // собирает отфильт. заказы обратно в список
        System.out.println("Заказы после " + filterDate + ":");
        ordersAfterDate.forEach(System.out::println); //forEach метод, который проход. по всем элемента списка
        System.out.println("----------------------");

        List<Order> shippedOrders = orders.stream() //Фильтруем заказы по статусу SHIPPED
                .filter(order -> "SHIPPED".equals(order.getStatus()))
                .collect(Collectors.toList());
        System.out.println("Заказы со статусом 'SHIPPED':");
        shippedOrders.forEach(System.out::println);
        System.out.println("----------------------");

        Map<String, Long> statusCounts = orders.stream()//считаем кол-во заказов каждого статуса
                .collect(Collectors.groupingBy(Order::getStatus, Collectors.counting()));
        System.out.println("Количество заказов по статусам:");
        statusCounts.forEach((status, count) -> System.out.println(status + ": " + count));
        System.out.println("----------------------");

        List<Order> highAmountOrders = orders.stream()//список заказов с суммой больше 500
                .filter(order -> order.getAmount() > 500)
                .collect(Collectors.toList());
        System.out.println("Заказы с суммой более 500:");
        highAmountOrders.forEach(System.out::println);
        System.out.println("----------------------");

        Optional<Order> maxAmountOrder = orders.stream()//ищем клиента с наиб. заказом
                .max(Comparator.comparingDouble(Order::getAmount)); // компаратор, который сравнивает заказы по их сумме
        maxAmountOrder.ifPresent(order -> System.out.println("Клиент с наибольшим заказом: " + order.getCustomerName() +  " Заказ на сумму: " + order.getAmount()));
    }
}
