package com.epam.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_user", schema = "public")

public class OrderUser {
    @Column(name = "user_id", nullable = false)
    private long userId;
    @Id
    @Column(name = "order_id", nullable = false)
    private long orderId;

    public OrderUser() {
    }

    public OrderUser(long userId, long orderId) {
        this.userId = userId;
        this.orderId = orderId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderUser orderUser = (OrderUser) o;

        if (userId != orderUser.userId) return false;
        return orderId == orderUser.orderId;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (orderId ^ (orderId >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "OrderUser{" +
                "userId=" + userId +
                ", orderId=" + orderId +
                '}';
    }
}
