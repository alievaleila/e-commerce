package az.edu.itbrains.ecommerce.services;

import az.edu.itbrains.ecommerce.model.Basket;
import az.edu.itbrains.ecommerce.model.Order;

import java.util.List;

public interface OrderItemService {
    void createOrderItems(Order order, List<Basket> baskets);
}
