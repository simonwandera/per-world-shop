package com.parworld.shop.service;

import com.parworld.shop.model.ProductType;
import com.parworld.shop.repository.ProductTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductTypeServiceImpl implements ProductTypeServiceI {

    private final ProductTypeRepository productTypeRepository;

    @Override
    public ProductType saveProduct(ProductType type) {
        return productTypeRepository.save(type);
    }
}