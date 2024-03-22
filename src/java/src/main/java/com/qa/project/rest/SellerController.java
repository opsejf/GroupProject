package com.qa.project.rest;

import com.qa.project.entities.Seller;
import com.qa.project.repos.SellerRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {
    @Autowired
    private SellerRepos sellerRepository;

    @GetMapping
    public Iterable findAll() {
        return sellerRepository.findAll();
    }

    @GetMapping("/{id]")
    public Seller findSeller(@PathVariable long id) {
        return sellerRepository.findById(id)
                .orElseThrow(SellerNotFoundException::new);
        sellerRepository.deleteById(id);
    }
}
