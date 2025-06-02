package com.parworld.shop.repository;

import com.parworld.shop.model.ProductType;
import com.parworld.shop.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {

    @Query(nativeQuery = true, "select * from product_type")
    ProductType getProductTypeByType(Type type);


}