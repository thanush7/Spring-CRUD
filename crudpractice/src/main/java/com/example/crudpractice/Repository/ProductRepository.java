package com.example.crudpractice.Repository;

import com.example.crudpractice.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Integer> {

    Product findByName(String name);
}
