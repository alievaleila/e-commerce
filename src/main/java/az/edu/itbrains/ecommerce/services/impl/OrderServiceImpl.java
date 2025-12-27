package az.edu.itbrains.ecommerce.services.impl;

import az.edu.itbrains.ecommerce.dtos.order.OrderCreateDto;
import az.edu.itbrains.ecommerce.enums.OrderStatus;
import az.edu.itbrains.ecommerce.model.Basket;
import az.edu.itbrains.ecommerce.model.Order;
import az.edu.itbrains.ecommerce.model.OrderItem;
import az.edu.itbrains.ecommerce.model.User;
import az.edu.itbrains.ecommerce.repositories.OrderRepository;
import az.edu.itbrains.ecommerce.services.BasketService;
import az.edu.itbrains.ecommerce.services.OrderItemService;
import az.edu.itbrains.ecommerce.services.OrderService;
import az.edu.itbrains.ecommerce.services.ProductService;
import az.edu.itbrains.ecommerce.services.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final BasketService basketService;
    private final UserService userService;
    private final ProductService productService;
    private final OrderItemService orderItemService;
    private final ModelMapper modelMapper;

    @Override
    public boolean createNewOrder(String email, OrderCreateDto orderCreateDto) {

        User user = userService.getByEmail(email);
        Order order = new Order();
        order.setOrderStatus(OrderStatus.PENDING);
        order.setUser(user);
        order.setAddress(orderCreateDto.getAddress());
        order.setFullAddress(orderCreateDto.getFullAddress());
        order.setPhone(orderCreateDto.getPhone());
        order.setNote(orderCreateDto.getNote());

//        List<OrderItem> orderItems = new ArrayList<>();
//
//        for (Basket basket : user.getBaskets()) {
//            OrderItem orderItem = new OrderItem();
//            orderItem.setOrder(order);
//            orderItem.setProduct(basket.getProduct());
//            orderItem.setQuantity(basket.getQuantity());
//            orderItem.setPrice(basket.getProduct().getPrice());
//            orderItems.add(orderItem);
//        }
//
//        order.setOrderItems(orderItems);

        orderItemService.createOrderItems(order, user.getBaskets());
        orderRepository.save(order);

        basketService.removeAllItemsByEmail(user.getEmail());

        return true;
    }
}
