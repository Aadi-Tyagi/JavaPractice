package com.example.eCommerce.Controller;

import com.example.eCommerce.Entity.Customer;
import com.example.eCommerce.Entity.OrderItem;
import com.example.eCommerce.Entity.Orders;
import com.example.eCommerce.Exceptions.OrderValidationException;
import com.example.eCommerce.Service.OrderService;
import com.example.eCommerce.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final CustomerService customerService;

    @Autowired
    public OrderController(OrderService orderService, CustomerService customerService) {
        this.orderService = orderService;
        this.customerService=customerService;
    }

    @GetMapping
    public List<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Orders getOrderById(@PathVariable int id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/{customerId}")
    public void createOrder(@PathVariable int customerId, @RequestBody Orders order) throws OrderValidationException {
        Customer customer = customerService.getCustomerById(customerId);
        order.setCustomer(customer); // Set the customer for the order
        orderService.createOrder(order);
    }

    @PutMapping("/{id}")
    public void updateOrder(@PathVariable int id, @RequestBody Orders order) {
        orderService.updateOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable int id) {
        orderService.deleteOrder(id);
    }

    @PostMapping("/{orderId}/items")
    public void addOrderItem(@PathVariable int orderId, @RequestBody OrderItem orderItem) {
        orderService.addOrderItem(orderId, orderItem);
    }
}
