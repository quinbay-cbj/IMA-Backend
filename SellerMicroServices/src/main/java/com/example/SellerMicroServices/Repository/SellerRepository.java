package com.example.SellerMicroServices.Repository;

import com.example.SellerMicroServices.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends JpaRepository<Product,String> {
    public List<Product> findAllBySellerId(String sellerId);
}
