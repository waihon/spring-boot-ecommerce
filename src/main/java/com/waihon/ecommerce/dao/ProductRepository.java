package com.waihon.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.waihon.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
