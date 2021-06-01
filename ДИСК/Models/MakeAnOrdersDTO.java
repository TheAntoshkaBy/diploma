package com.epam.dto.request.create;

import java.util.List;

import javax.validation.constraints.NotEmpty;

public class MakeAnOrdersDTO {

    @NotEmpty(message = "Incorrect orders list (Should contain some orders)")
    private List<MakeAnOrderDTO> orders;

    public List<MakeAnOrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<MakeAnOrderDTO> orders) {
        this.orders = orders;
    }
}
