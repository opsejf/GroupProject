package com.qa.project.repos;

import com.qa.project.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SellerRepo extends JpaRepository<Seller, Integer> {
}


