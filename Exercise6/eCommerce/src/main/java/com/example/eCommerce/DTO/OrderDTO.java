package com.example.eCommerce.DTO;

import com.example.eCommerce.Entity.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {
    private Integer id;
    private Integer customerId;
    private String customerName;
    private String phoneNumber;
    private List<OrderItem> items;

}

