package com.qa.project.services;

import com.qa.project.entities.Buyer;
import com.qa.project.repos.BuyerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BuyerService {

    private BuyerRepo repo;

    public BuyerService(BuyerRepo repo) {
        this.repo = repo;
    }

    public List<Buyer> getAll() {
        return this.repo.findAll();
    }
    public Buyer get(int id) {
        return this.repo.findById(id).get();
    }

    public Buyer createBuyer(Buyer buyer) {
        return this.repo.save(buyer);
    }

    public Buyer updateBuyer(Integer id, String firstName, String lastName, String email, String mobileNo) {
        Buyer updatedBuyer = this.get(id);

        if (firstName != null) updatedBuyer.setFirstName(firstName);
        if (lastName != null) updatedBuyer.setLastName(lastName);
        if (email != null) updatedBuyer.setEmail(email);
        if(mobileNo != null) updatedBuyer.setMobileNo(mobileNo);

        return this.repo.save(updatedBuyer);
    }

    public Buyer removePerson(int id) {
        Buyer removedBuyer = this.get(id);
        this.repo.deleteById(id);
        return removedBuyer;
    }
}
