
package com.qa.project.rest;

import com.qa.project.entities.Seller;
import com.qa.project.services.SellerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sellers")
public class SellerController {
    private final SellerService service;

    public SellerController(SellerService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<Seller> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/getSeller/{id}")
    public Seller getSeller(@PathVariable int id) {
        return this.service.getSeller(id);
    }

    @PostMapping("/authenticate")
    public String authenticateSeller(@RequestParam String email, @RequestParam String password) {
        String token = this.service.authenticateSeller(email, password);
        if (token != null) {
            return token;
        } else {
            return "Authentication failed";
        }
    }




    @PostMapping("/create")
    public Seller createSeller(@RequestBody Seller seller) {
        return this.service.createSeller(seller);
    }

    @DeleteMapping("/remove/{id}")
    public Seller removeSeller(@PathVariable int id) {
        return this.service.removeSeller(id);
    }

    @PatchMapping("/update/{id}")
    public Seller updateSeller(@PathVariable int id,
                               @RequestParam(required = false) String firstName,
                               @RequestParam(required = false) String lastName,
                               @RequestParam(required = false) String address,
                               @RequestParam(required = false) String email,
                               @RequestParam(required = false) String postCode,
                               @RequestParam(required = false) String telephone) {
        return this.service.updateSeller(id, firstName, lastName, address, email, postCode, telephone);
    }
}
