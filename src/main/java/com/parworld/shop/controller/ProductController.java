package com.parworld.shop.controller;

import com.parworld.shop.model.ProductType;
import com.parworld.shop.service.ProductTypeServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductTypeServiceI productTypeService;

    //  POST
    @PostMapping("/saveType")
    public ResponseEntity<String> getAuthor(@RequestBody ProductType type) {
        // Logic to fetch product details by productId

        type = productTypeService.saveProduct(type);

        return ResponseEntity.ok("Type saved successfully: " + type.getName());

    }

}
