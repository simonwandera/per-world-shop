package com.parworld.shop.service;

import com.parworld.shop.model.Product;
import com.parworld.shop.model.ProductType;
import org.springframework.stereotype.Service;

@Service
public interface ProductTypeServiceI {
    ProductType saveProduct(ProductType product);
}
