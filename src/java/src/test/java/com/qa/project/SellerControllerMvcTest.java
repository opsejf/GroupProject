package com.qa.project;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.project.entities.Seller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class SellerControllerMvcTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;

    // create seller
    Seller newSeller = new Seller(1L,
            "John",
            "Doe",
            "email",
            "124 main",
            "M1",
            "0832098");

    // Create seller test
    @Test
    void testCreate() throws Exception {
        String newSellerAsJson = this.mapper.writeValueAsString(newSeller);
        RequestBuilder mockRequest = MockMvcRequestBuilders.post("/api/sellers/create")
                .contentType(MediaType.APPLICATION_JSON).content(newSellerAsJson);

        ResultMatcher checkStatusCode = MockMvcResultMatchers.status().isOk();

        Seller resultTestSeller = new Seller(1L, "John", "Doe", "email", "124 main", "M1", "0832098");
        String resultTestSellerAsJson = this.mapper.writeValueAsString(resultTestSeller);
        ResultMatcher checkBody = MockMvcResultMatchers.content().json(resultTestSellerAsJson);

        this.mvc.perform(mockRequest).andExpect(checkStatusCode).andExpect(checkBody);
    }

    // Get seller by ID test
    @Test
    void testGetSeller() throws Exception {
        String newSellerAsJson = this.mapper.writeValueAsString(newSeller);
        RequestBuilder mockRequest = MockMvcRequestBuilders.post("/api/sellers/create")
                .contentType(MediaType.APPLICATION_JSON).content(newSellerAsJson);

        Seller resultGetSellerTest = new Seller(1L, "John", "Doe", "email", "124 main", "M1", "0832098");
        String resultGetSellerTestAsJson = this.mapper.writeValueAsString((resultGetSellerTest));

        this.mvc.perform(mockRequest);
        this.mvc.perform(MockMvcRequestBuilders.get("/api/sellers/getSeller/{id}", 1).accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(resultGetSellerTestAsJson));
    }

    // Get all sellers test
    @Test
    void testGetAllSellers() throws Exception {
        String newSellerAsJson = this.mapper.writeValueAsString(newSeller);
        RequestBuilder mockRequest = MockMvcRequestBuilders.get("/api/sellers/getAll")
                .contentType(MediaType.APPLICATION_JSON).content(newSellerAsJson);


    }

    // Delete sellers test


    // Patch sellers test



}