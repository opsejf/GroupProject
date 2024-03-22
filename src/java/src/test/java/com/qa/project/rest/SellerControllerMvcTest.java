package com.qa.project.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.project.entities.Seller;
import jakarta.persistence.GeneratedValue;
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

    @Test
    void testCreate() throws Exception {
        Seller newSeller = new Seller(1,
                "Mock",
                "Doe",
                "123 main",
                "M1",
                "0832098");
        String newSellerAsJson = this.mapper.writeValueAsString(newSeller);
        RequestBuilder mockRequest = MockMvcRequestBuilders.post("/api/sellers/create")
                .contentType(MediaType.APPLICATION_JSON).content(newSellerAsJson);

        ResultMatcher checkStatusCode = MockMvcResultMatchers.status().isOk();

        Seller resultTestSeller = new Seller(1, "Mock", "Doe", "123 main", "M1", "0832098");
        String resultTestSellerAsJson = this.mapper.writeValueAsString(resultTestSeller);
        ResultMatcher checkBody = MockMvcResultMatchers.content().json(resultTestSellerAsJson);

        this.mvc.perform(mockRequest).andExpect(checkStatusCode).andExpect(checkBody);
    }
}