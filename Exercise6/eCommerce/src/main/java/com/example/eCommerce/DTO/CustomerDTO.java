package com.example.eCommerce.DTO;

import com.example.eCommerce.Entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO  {
    private Integer id;
    private Integer customerId;
    private String customerName;
    private String phoneNumber;
    private String address;

    private List<Orders> orders;


}

