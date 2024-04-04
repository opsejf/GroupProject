package com.qa.project;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.project.entities.Buyer;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BuyerControllerMvcTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;

    public static long buyerId;


    // create buyer
    Buyer newBuyer = new Buyer(
            "TESTTHISBUYER",
            "Doe",
            "email",
            "0832098");

    // Create buyer test
    @Test
    @Order(1)
    void testCreate() throws Exception {
        String newBuyerAsJson = this.mapper.writeValueAsString(newBuyer);
        RequestBuilder mockRequest = MockMvcRequestBuilders.post("/create-buyer")
                .contentType(MediaType.APPLICATION_JSON).content(newBuyerAsJson);

        ResultMatcher checkStatusCode = MockMvcResultMatchers.status().isOk();

        String response = this.mvc.perform(mockRequest)
                .andExpect(checkStatusCode)
                .andReturn().getResponse().getContentAsString();

        JsonNode jsonResponse = mapper.readTree(response);
        long objectId = jsonResponse.get("id").asLong();
        buyerId = objectId;

        Buyer resultTestBuyer = new Buyer(objectId, "TESTTHISBUYER", "Doe", "email", "0832098");
        String resultTestBuyerAsJson = this.mapper.writeValueAsString(resultTestBuyer);
        ResultMatcher checkBody = MockMvcResultMatchers.content().json(resultTestBuyerAsJson);

        String resultBuyer = this.mapper.writeValueAsString(jsonResponse);

        assertEquals(resultTestBuyerAsJson, resultBuyer);
    }

    // Get buyer by ID test
    @Test
    @Order(2)
    void testGetBuyer() throws Exception {
        Buyer resultGetBuyerTest = new Buyer(buyerId, "TESTTHISBUYER", "Doe", "email", "0832098");
        String resultGetBuyerTestAsJson = this.mapper.writeValueAsString((resultGetBuyerTest));

        this.mvc.perform(MockMvcRequestBuilders.get("/buyer/{id}", buyerId)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(resultGetBuyerTestAsJson));
    }

    // Get all buyers test
    @Test
    @Order(3)
    void testGetAllBuyers() throws Exception {
        String newBuyerAsJson = this.mapper.writeValueAsString(newBuyer);
        mvc.perform(MockMvcRequestBuilders.get("/buyers")
                .contentType(MediaType.APPLICATION_JSON).content(newBuyerAsJson))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    // Patch buyers test

    @Test
    @Order(4)
    void testPatchBuyers() throws Exception {
        mvc.perform(MockMvcRequestBuilders.patch("/update-buyer/{id}", buyerId)
                .contentType(MediaType.APPLICATION_JSON)
                .param("first_name" , "Changed"));


        Buyer resultGetBuyerTest = new Buyer(buyerId, "Changed", "Doe", "email", "0832098");
        String resultGetBuyerTestAsJson = this.mapper.writeValueAsString((resultGetBuyerTest));

        mvc.perform(MockMvcRequestBuilders.get("/buyer/{id}", buyerId)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(resultGetBuyerTestAsJson));
    }


    // Delete buyers test

    @Test
    @Order(5)
    void testDeleteBuyer() throws Exception {
        mvc.perform(MockMvcRequestBuilders.delete("/remove-buyer/{id}", buyerId)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}