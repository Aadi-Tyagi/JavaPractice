package com.example.eCommerce.Service;

import com.example.eCommerce.Dao.ProductRepository;
import com.example.eCommerce.Entity.Product;
import com.example.eCommerce.Exceptions.ProductNotFoundException;
import com.example.eCommerce.Exceptions.ProductValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product addProduct(Product product){
        if(product.getPrice()>=0){
            return productRepository.save(product);
        }
        throw new ProductValidationException("Price must be greater than or equal to 0");
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElseThrow(()->new ProductNotFoundException("No Product found with id:" +id));
    }
    public Product updateProduct(int id, Product product){
        Product existingProduct = getProductById(id);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());

        return productRepository.save(existingProduct);

    }
    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }
}
