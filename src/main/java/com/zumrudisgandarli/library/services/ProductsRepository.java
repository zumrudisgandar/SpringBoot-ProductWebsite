package com.zumrudisgandarli.library.services;

import com.zumrudisgandarli.library.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
