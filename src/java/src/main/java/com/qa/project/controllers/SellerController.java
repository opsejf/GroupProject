package com.qa.project.controllers;

import com.qa.project.entities.Seller;
import com.qa.project.services.SellerService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SellerController {
    private final SellerService sService;

    public SellerController(SellerService service) {
        this.sService = service;
    }

    @GetMapping("/sellers")
    public List<Seller> getAll() {
        return this.sService.getAll();
    }

    @GetMapping("/seller/{id}")
    public Seller getSeller(@PathVariable int id) {
        return this.sService.getSeller(id);
    }

    @PostMapping("/create-seller")
    public Seller createSeller(@RequestBody Seller seller) {
        return this.sService.createSeller(seller);
    }

    @DeleteMapping("/remove-seller/{id}")
    public Seller removeSeller(@PathVariable int id) {
        return this.sService.removeSeller(id);
    }

    @PatchMapping("/update-seller/{id}")
    public Seller updateSeller(@PathVariable int id,
                               @RequestParam(required = false) String firstName,
                               @RequestParam(required = false) String lastName,
                               @RequestParam(required = false) String email,
                               @RequestParam(required = false) String telephone) {
        return this.sService.updateSeller(id, firstName, lastName, email, telephone);
    }
}
