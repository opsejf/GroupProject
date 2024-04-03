package com.qa.project.repos;

import com.qa.project.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepos extends JpaRepository<Seller, Integer> {
    Seller findByEmail(String email);

}
