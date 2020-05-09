package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private int id;
    private Date moment;
    private OrderStatus status;

    public Order() {
    }

    public Order(int id, Date moment, OrderStatus order) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + sdf.format(moment) +
                ", status=" + status +
                '}';
    }
}
