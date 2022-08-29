package com.example.SellerMicroServices.Controller;

import com.example.SellerMicroServices.Entity.Product;
import com.example.SellerMicroServices.Exception.NullException;
import com.example.SellerMicroServices.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/seller")
public class ProductController {



    @Autowired
    ProductService productService;

    @GetMapping("/product/{sellerId}")
    public List<Product> findBySellerId(@PathVariable String sellerId){
        try {
            return productService.findRecordsBySellerid(sellerId);
        } catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
        }
    }



}

