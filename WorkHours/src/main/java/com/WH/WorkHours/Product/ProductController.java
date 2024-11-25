package com.WH.WorkHours.Product;
//package Product.Cont;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin("http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String getMsg() {
        System.err.print("hi this glory team......");
        return "hi this spring boot";
    }

    @GetMapping("getProducts")
    public List<ProductDTO> getProducts() {
        System.out.println("in product controller");
        return service.getAllProducts();
        
    }
}
