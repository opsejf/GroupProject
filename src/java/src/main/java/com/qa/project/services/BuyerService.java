package com.qa.project.services;

import com.qa.project.entities.Buyer;
import com.qa.project.repos.BuyerRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BuyerService {

    private final List<Buyer> buyers = new ArrayList<>();
    private BuyerRepo repo;

    public BuyerService(BuyerRepo repo) {
        this.repo = repo;
    }

    public List<Buyer> getAll() {
        return this.buyers;
    }
    public Buyer get(int id) {
        return this.repo.findById(id).get();
    }

    public Buyer createBuyer(Buyer buyer) {
        return this.repo.save(buyer);
    }

    public Buyer updateBuyer(Integer id, String firstName, String lastName, String email, String telephone) {
        Buyer updatedBuyer = this.get(id);

        if (firstName != null) updatedBuyer.setFirstName(firstName);
        if (lastName != null) updatedBuyer.setLastName(lastName);
        if (email != null) updatedBuyer.setEmail(email);
        if(telephone != null) updatedBuyer.setTelephone(telephone);

        return this.repo.save(updatedBuyer);
    }

    public Buyer removeBuyer(int id) {
        Buyer removed = this.get(id);
        this.repo.deleteById(id);
       return removed;
    }
}
