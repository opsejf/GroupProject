package com.qa.project.controllers;

import com.qa.project.entities.Buyer;
import com.qa.project.services.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuyerController {

    @Autowired
    private BuyerService service;

    public BuyerController(BuyerService service){
        this.service = service;
    }

    @GetMapping("/buyers")
    public List<Buyer> getAll() {
        return this.service.getAll();
    }
    @GetMapping("/buyer/{id}")
    public Buyer get(@PathVariable int id) { return this.service.get(id); }

    @PostMapping("/create-buyer")
    public Buyer createBuyer(@RequestBody Buyer buyer) {
        return this.service.createBuyer(buyer);
    }

    @PatchMapping("/update-buyer")
    public Buyer updateBuyer(@PathVariable int id,
                             @RequestParam(required = false) String first_name,
                             @RequestParam(required = false) String last_name,
                             @RequestParam(required = false) String email,
                             @RequestParam(required = false) String telephone)
    {
        return this.service.updateBuyer(id, first_name, last_name, email, telephone);
    }

    @DeleteMapping("/remove/{id}")
    public Buyer removeBuyer(@PathVariable int id){
        return this.service.removeBuyer(id);
    }
}
