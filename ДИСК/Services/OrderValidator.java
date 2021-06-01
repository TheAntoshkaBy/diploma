package com.epam.validator;

import com.epam.dao.OrderDAO;
import com.epam.dao.OrderUserDAO;
import com.epam.entity.OrderUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderValidator {

    @Autowired
    private OrderUserDAO orderUserDAO;

    @Autowired
    private OrderDAO orderDAO;

    public boolean isConnected(OrderUser orderUser) {
        return orderUserDAO.checkConnection(orderUser);
    }

    public boolean isExist(long orderId) {
        if (orderDAO.getOrderWithoutException(orderId) == null) {
            return false;
        } else {
            return true;
        }
    }

}
