package com.qa.project.controllers;

import com.qa.project.services.BuyerService;

public class BuyerController {

    private BuyerService service;

    public BuyerController(BuyerService service){
        this.service = service;
    }
}
