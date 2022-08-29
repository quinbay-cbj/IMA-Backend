package com.example.SellerMicroServices.ServiceImplementation;

import com.example.SellerMicroServices.Entity.Product;
import com.example.SellerMicroServices.Exception.NullException;
import com.example.SellerMicroServices.Repository.SellerRepository;
import com.example.SellerMicroServices.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceImplementation implements ProductService {
    @Autowired
    SellerRepository sellerRepository;

    @Override
    public List<Product> findRecordsBySellerid(String sellerId) throws NullException {
        if(sellerRepository.findAllBySellerId(sellerId).isEmpty())
            throw new NullException();

        return sellerRepository.findAllBySellerId(sellerId);
    }
}
