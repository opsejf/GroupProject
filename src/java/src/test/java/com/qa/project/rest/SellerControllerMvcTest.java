package com.qa.project.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.project.entities.Seller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class SellerControllerMvcTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    void testCreate() {
        Seller newSeller = new Seller("John", "Doe", "johndoe@outlook.com", "03874927");
        RequestBuilder mockRequest = MockMvcRequestBuilders.post("/createSeller")
                .contentType(MediaType.APPLICATION_JSON);




    }
}