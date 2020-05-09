package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String args[]) {

        Order order = new Order(1080, new Date(), OrderStatus.DELIVERED);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.valueOf("DELIVERED"); // recebendo texto. precisa existir na enum constant
        OrderStatus os2 = OrderStatus.PENDING_PAYMENT;

        System.out.println(os1 + " " + os2);

    }

}
