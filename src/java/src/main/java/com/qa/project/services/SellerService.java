package com.qa.project.services;

import com.qa.project.entities.Seller;
import com.qa.project.repos.SellerRepos;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class SellerService {
    private final SellerRepos repo;

    public SellerService(SellerRepos repo) {
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
                               String address,
                               String postCode,
                               String telephone) {
        Seller updatingSeller = this.repo.findById(id).get();

        if(firstName != null) updatingSeller.setFirstName(firstName);
        if(lastName != null) updatingSeller.setLastName(lastName);
        if(address != null) updatingSeller.setAddress(address);
        if(postCode != null) updatingSeller.setPostCode(postCode);
        if(telephone != null) updatingSeller.setTelephone(telephone);

        return this.repo.save(updatingSeller);
    }

    public String authenticateSeller(String email, String password) {
        Seller seller = repo.findByEmail(email);
        if (seller != null && seller.getPassword().equals(password)) {
            // Authentication successful
            return "testToken123"; // Return a token upon successful authentication
        } else {
            // Authentication failed
            return null;
        }
    }

}
