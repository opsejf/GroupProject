package com.qa.project.repos;

import com.qa.project.entities.Seller;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SellerRepos extends CrudRepository<Seller, Long> {
    List<Seller> findById(int id);
}
