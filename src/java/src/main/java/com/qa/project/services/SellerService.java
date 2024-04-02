package com.qa.project.services;

import com.qa.project.entities.Seller;
import com.qa.project.repos.SellerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {
    private final SellerRepo repo;

    public SellerService(SellerRepo repo) {
        this.repo = repo;
    }

    public List<Seller> getAll() {
        return this.repo.findAll();
    }

    public Seller getSeller(int id) {
        return this.repo.findById(id).get();
    }


    public Seller createSeller(Seller seller) {
        return this.repo.save(seller);
    }

    public Seller removeSeller(int id) {
        Seller removed = this.repo.findById(id).get();
        this.repo.deleteById(id);
        return removed;
    }


    public Seller updateSeller(int id,
                               String firstName,
                               String lastName,
                               String email,
                               String telephone) {
        Seller updatingSeller = this.repo.findById(id).get();

        if(firstName != null) updatingSeller.setFirstName(firstName);
        if(lastName != null) updatingSeller.setLastName(lastName);
        if(email != null) updatingSeller.setEmail(email);
        if(telephone != null) updatingSeller.setTelephone(telephone);

        return this.repo.save(updatingSeller);
    }
}
