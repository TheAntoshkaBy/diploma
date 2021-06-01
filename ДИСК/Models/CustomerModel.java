package com.epam.model;

import java.util.List;

import org.springframework.hateoas.RepresentationModel;

public class CustomerModel extends RepresentationModel<CustomerModel> {

    private float totalPrice;

    private String username;

    private long userId;

    private GenreModel favoriteGenre;

    private List<OrderModel> orders;

    public List<OrderModel> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderModel> orders) {
        this.orders = orders;
    }

    public GenreModel getFavoriteGenre() {
        return favoriteGenre;
    }

    public void setFavoriteGenre(GenreModel favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
