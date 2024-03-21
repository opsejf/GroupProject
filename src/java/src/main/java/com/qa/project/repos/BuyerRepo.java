package com.qa.project.repos;

import com.qa.project.entities.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public interface BuyerRepo extends JpaRepository<Buyer, Integer> {

    @GetMapping("/getAll")
    public List<Buyer> getAll() { return this.service.getAll(); }


    @GetMapping("/get/{id}")
    public Buyer get(@PathVariable int id) { };
}
