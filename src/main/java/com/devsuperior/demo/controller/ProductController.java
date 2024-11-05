package com.devsuperior.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.entites.Department;
import com.devsuperior.demo.entites.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public List<Product> getObject(){
        Department d1 = new Department(1l,"tech");
        Department d2 = new Department(2l,"Pet");

        Product p1 = new Product(1L,"MackBook Pro",4000.00,d1);
        Product p2 = new Product(2l,"Computador",3000.00,d1);
        Product p3 = new Product(2l,"coleira",20.00,d2);

        List<Product> list = Arrays.asList(p1,p2,p3);

        return list;
        
    }
}
