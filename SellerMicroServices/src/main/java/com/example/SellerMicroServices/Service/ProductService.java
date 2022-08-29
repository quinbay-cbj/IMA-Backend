package com.example.SellerMicroServices.Service;

import com.example.SellerMicroServices.Entity.Product;
import com.example.SellerMicroServices.Exception.NullException;

import java.util.List;

public interface ProductService {

    public List<Product> findRecordsBySellerid(String sellerId) throws NullException;


}
