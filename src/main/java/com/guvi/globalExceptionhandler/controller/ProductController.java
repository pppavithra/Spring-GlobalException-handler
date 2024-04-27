package com.guvi.globalExceptionhandler.controller;

import com.guvi.globalExceptionhandler.service.ProductService;
import com.guvi.globalExceptionhandler.service.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

        //From controller->we are going to injection servie layer->
        @Autowired
        private ProductService productService;

         //localhost:8080/api/findAll
        //findAll
        @GetMapping("/findAll")
        public List<Products> findAllProducts(){
            return  productService.findAll();
        }

// localhost:8080/api/findById

        //findById
        @GetMapping("/findById")
        public Products findById(@RequestParam long id) {
            return productService.findById(id);
        }


        //create or save
        @PostMapping("/save")
        public  Products save(@RequestBody Products product){
            return productService.save(product);
        }

    }

