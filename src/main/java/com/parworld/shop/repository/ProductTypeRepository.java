package com.parworld.shop.repository;

import com.parworld.shop.model.Product;
import com.parworld.shop.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {
}