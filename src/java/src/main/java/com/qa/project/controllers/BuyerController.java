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
    private BuyerService bService;

    public BuyerController(BuyerService service){
        this.bService = service;
    }

    @GetMapping("/buyers")
    public List<Buyer> getAll() {
        return this.bService.getAll();
    }
    @GetMapping("/buyer/{id}")
    public Buyer get(@PathVariable int id) { return this.bService.get(id); }

    @PostMapping("/create-buyer")
    public Buyer createBuyer(@RequestBody Buyer buyer) {
        return this.bService.createBuyer(buyer);
    }

    @PatchMapping("/update-buyer/{id}")
    public Buyer updateBuyer(@PathVariable int id,
                             @RequestParam(required = false) String first_name,
                             @RequestParam(required = false) String last_name,
                             @RequestParam(required = false) String email,
                             @RequestParam(required = false) String telephone)
    {
        return this.bService.updateBuyer(id, first_name, last_name, email, telephone);
    }

    @DeleteMapping("/remove-buyer/{id}")
    public Buyer removeBuyer(@PathVariable int id){
        return this.bService.removeBuyer(id);
    }
}
