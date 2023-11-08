package com.example.eCommerce.Service;

import com.example.eCommerce.Dao.CustomerRepo;
import com.example.eCommerce.Entity.Customer;
import com.example.eCommerce.Exceptions.CustomerNotFoundException;
import com.example.eCommerce.Exceptions.CustomerValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    public Customer registerCustomer(Customer customer) {
        // Check for required fields
        if (customer.getUsername() == null || customer.getUsername().isEmpty()) {
            throw new CustomerValidationException("Username is required.");
        }
        if (customer.getPassword() == null || customer.getPassword().isEmpty()) {
            throw new CustomerValidationException("Password is required.");
        }

        // Check for username constraints (e.g., length, character set)
        if (customer.getUsername().length() < 6) {
            throw new CustomerValidationException("Username must be at least 6 characters.");
        }

        // Check for password constraints (e.g., length, complexity)
        if (customer.getPassword().length() < 8) {
            throw new CustomerValidationException("Password must be at least 8 characters.");
        }

        // Check for duplicate username
        if (customerRepo.existsByUsername(customer.getUsername())) {
            throw new CustomerValidationException("Username is already in use.");
        }


        // If all validations pass, save the customer
        return customerRepo.save(customer);
    }


    public Customer getCustomerById(int id) {
        return customerRepo.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("No Customer found with id: " + id));
    }

    public Customer updateCustomer(int id, Customer customer) {
        Customer existingCustomer = getCustomerById(id);
        existingCustomer.setUsername(customer.getUsername());
        existingCustomer.setPassword(customer.getPassword());

        return customerRepo.save(existingCustomer);
    }

    public void deleteCustomer(int id) {
        customerRepo.deleteById(id);
    }
}
