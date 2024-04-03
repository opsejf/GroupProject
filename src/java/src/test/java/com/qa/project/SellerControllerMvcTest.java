package com.qa.project;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.project.entities.Seller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SellerControllerMvcTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;

    public static long sellerId;


    // create seller
    Seller newSeller = new Seller(
            "TESTTHISSELLER",
            "Doe",
            "email",
            "124 main",
            "M1",
            "0832098");

    // Create seller test

    @Test
    @Order(1)
    void testCreate() throws Exception {
        String newSellerAsJson = this.mapper.writeValueAsString(newSeller);
        RequestBuilder mockRequest = MockMvcRequestBuilders.post("/api/sellers/create")
                .contentType(MediaType.APPLICATION_JSON).content(newSellerAsJson);

        ResultMatcher checkStatusCode = MockMvcResultMatchers.status().isOk();

        String response = this.mvc.perform(mockRequest)
                .andExpect(checkStatusCode)
                .andReturn().getResponse().getContentAsString();

        JsonNode jsonResponse = mapper.readTree(response);
        long objectId = jsonResponse.get("id").asLong();
        sellerId = objectId;
        System.out.println(objectId);

        Seller resultTestSeller = new Seller(objectId, "TESTTHISSELLER", "Doe", "email", "124 main", "M1", "0832098");
        String resultTestSellerAsJson = this.mapper.writeValueAsString(resultTestSeller);
        ResultMatcher checkBody = MockMvcResultMatchers.content().json(resultTestSellerAsJson);

        String resultSeller = this.mapper.writeValueAsString(jsonResponse);

        assertEquals(resultTestSellerAsJson, resultSeller);
    }

    // Get seller by ID test


    @Test
    @Order(2)
    void testGetSeller() throws Exception {
        Seller resultGetSellerTest = new Seller(sellerId, "TESTTHISSELLER", "Doe", "email", "124 main", "M1", "0832098");
        String resultGetSellerTestAsJson = this.mapper.writeValueAsString((resultGetSellerTest));

        this.mvc.perform(MockMvcRequestBuilders.get("/api/sellers/getSeller/{id}", sellerId)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(resultGetSellerTestAsJson))
                .andDo(print());
    }

    // Get all sellers test

    @Test
    @Order(3)
    void testGetAllSellers() throws Exception {
        String newSellerAsJson = this.mapper.writeValueAsString(newSeller);
        mvc.perform(MockMvcRequestBuilders.get("/api/sellers/getAll")
                .contentType(MediaType.APPLICATION_JSON).content(newSellerAsJson))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }

    // Patch sellers test

    @Test
    @Order(4)
    void testPatchSellers() throws Exception {
        mvc.perform(MockMvcRequestBuilders.patch("/api/sellers/update/{id}", sellerId)
                .contentType(MediaType.APPLICATION_JSON)
                .param("firstName" , "Changed"));


        Seller resultGetSellerTest = new Seller(sellerId, "Changed", "Doe", "email", "124 main", "M1", "0832098");
        String resultGetSellerTestAsJson = this.mapper.writeValueAsString((resultGetSellerTest));

        mvc.perform(MockMvcRequestBuilders.get("/api/sellers/getSeller/{id}", sellerId)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(resultGetSellerTestAsJson))
                .andDo(print());
    }


    // Delete sellers test

    @Test
    @Order(5)
    void testDeleteSeller() throws Exception {
        mvc.perform(MockMvcRequestBuilders.delete("/api/sellers/remove/{id}", sellerId)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }


}