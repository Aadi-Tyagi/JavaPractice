package com.example.eCommerce.Dao;

import com.example.eCommerce.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    boolean existsByUsername(String username);

}
