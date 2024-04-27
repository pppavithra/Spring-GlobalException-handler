package com.guvi.globalExceptionhandler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    //Service ->Repository

    //injecting productrepo into service layer->Field injection
    @Autowired
    private  ProductRepository productRepository;

    //method to fetch all products from the database
    public List<Products> findAll(){
        return productRepository.findAll();
    }


    // method to find product by product id
    public  Products findById(long id){
        return  productRepository.findById(id).orElseThrow(
                ()->new ProductnotFound("Product Not Found ..."));
    }


    //method to create ->save the product

    public Products save(Products product){
        return productRepository.save(product);
    }


}

