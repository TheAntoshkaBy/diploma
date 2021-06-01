package com.epam.dto.request.create;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class MakeAnOrderDTO {

    @Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$", message = "Incorrect orderTime " +
            "(Date must follow pattern hh.mm and be correct)")
    @NotBlank(message = "Incorrect orderTime (Should contain not only spaces)")
    @NotEmpty(message = "Incorrect orderTime (Should contain some information)")
    private String orderTime;

    @Min(value = 1, message = "Incorrect price value(Value must be more then 0)")
    private float price;

    @Min(value = 1, message = "Incorrect bookId value(Value must be more then 0)")
    private long bookId;

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }
}
