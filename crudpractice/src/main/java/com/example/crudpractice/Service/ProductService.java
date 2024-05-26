package com.example.crudpractice.Service;

import com.example.crudpractice.Entity.Product;
import com.example.crudpractice.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        List<Product> all = repository.findAll();
        return all;
    }


    public Product getProductbyId(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product removed";
    }

    public Product updateProduct(Product product){
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
    public Product getProductByName(String name){
        return repository.findByName(name);
    }
}
