package com.parworld.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    //MAke an endpoint that returns a list of products and test in postman

    //  POST
    @GetMapping("/author")
    public String getAuthor() {
        // Logic to fetch product details by productId
        return "Author Name: Simon ";
    }

}
