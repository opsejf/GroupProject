package com.qa.project.entities;

import groovyjarjarantlr4.v4.analysis.LeftRecursiveRuleAnalyzer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

class SellerEntityTest {
    private Seller seller;

    @BeforeEach
    void setUp() {
        seller = new Seller();
    }

    @Test
    void testDefaultSellerConstructor() {
        Seller defaultSeller = new Seller();
        assertNotNull(defaultSeller);
    }

    // test all argument constructor and get functions for entity
    @Test
    void testAllArgsSellerConstructor() {
        Seller allArgsSeller = new Seller(1,"John", "Doe","email", "123456");

        assertEquals(1, allArgsSeller.getId());
        assertEquals("John", allArgsSeller.getFirstName());
        assertEquals("Doe", allArgsSeller.getLastName());
        assertEquals("email", allArgsSeller.getEmail());
        assertEquals("123456", allArgsSeller.getTelephone());
    }

    @Test
    void testSetId() {
        seller.setId(2L);
        assertEquals(2, seller.getId());
    }

    @Test
    void testSetFirstName() {
        seller.setFirstName("testFirstName");
        assertEquals("testFirstName", seller.getFirstName());
    }

    @Test
    void testSetLastName() {
        seller.setLastName("testLastName");
        assertEquals("testLastName", seller.getLastName());
    }

    @Test
    void testSetEmail() {
        seller.setEmail("testAddress");
        assertEquals("testAddress", seller.getEmail());
    }
    @Test void testSetTelephone() {
        seller.setTelephone("00000");
        assertEquals("00000", seller.getTelephone());

    }
}