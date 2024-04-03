package com.qa.project;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.project.entities.Properties;
import com.qa.project.entities.Status;
import com.qa.project.entities.Type;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureMockMvc
public class PropertiesTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;
    /*
    @Autowired // saves us writing boilerplate to connect them
    public void PropertieService(PropertiesRepo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    private PropertiesDTO mapToDto(PropertiesDomain model) {
        return this.mapper.map(model, PropertiesDTO.class);
    }
    */

    @Mock
    private Seller mockSeller;
    @Mock
    private Buyer mockBuyer;

    private Properties property;
    private Properties propertyWithBuyer;
    private final Long id = 1L;
    private final String address = "123 Main St";
    private final String postcode = "12345";
    private final Type type = Type.APARTMENT;
    private final Integer bedrooms = 3;
    private final Integer bathrooms = 3;
    private  String description = "The best house on the street";
    private final Boolean garden = true;
    private final Float price = (float) 3000000.00;
    private final Status status = Status.FORSALE;

    @BeforeEach
    public void setUp() {
        propertyWithBuyer = new Properties (id, address, postcode, type, bedrooms,
                bathrooms, garden, price, status, mockSeller);

        property = new Properties(id, address, postcode, type, bedrooms, bathrooms,
                garden, price, status, mockSeller);

    ;}

    @Test
    public void testDefaultConstructor() {
        Properties defaultProperty = new Properties(id, address, postcode, type, bedrooms, bathrooms, garden, price, status, mockSeller);
        assertNotNull(defaultProperty);
    }

    @Test
    public void testNoBuyerConstructor() {
        assertNotNull(property);
        assertEquals(id, property.getId());
        assertEquals(address, property.getAddress());
        assertEquals(postcode, property.getPostcode());
        assertEquals(type, property.getType());
        assertEquals(bedrooms, property.getBedrooms());
        assertEquals(bathrooms, property.getBathrooms());
        assertEquals(description, description.getDescription());
        assertEquals(garden, property.getGarden());
        assertEquals(price, property.getPrice());
        assertEquals(status, property.getStatus());
        assertEquals(mockSeller, property.getSeller());
    }

    @Test
    public void testAllArgumentsConstructor() {
        assertNotNull(propertyWithBuyer);
        assertEquals(id, propertyWithBuyer.getId());
        assertEquals(address, propertyWithBuyer.getAddress());
        assertEquals(postcode, propertyWithBuyer.getPostcode());
        assertEquals(type, propertyWithBuyer.getType());
        assertEquals(bedrooms, propertyWithBuyer.getBedrooms());
        assertEquals(bathrooms, propertyWithBuyer.getBathrooms());
        assertEquals(description, description.getDescription());
        assertEquals(garden, propertyWithBuyer.getGarden());
        assertEquals(price, propertyWithBuyer.getPrice());
        assertEquals(status, propertyWithBuyer.getStatus());
        assertEquals(mockSeller, propertyWithBuyer.getSeller());
        assertEquals(mockBuyer, propertyWithBuyer.getBuyer());
    }

    @Test
    public void testGetId() {
        assertEquals(id, property.getId());
    }

    @Test
    public void testGetAddress() {
        assertEquals(address, property.getAddress());
    }

    @Test
    public void testGetPostcode() {
        assertEquals(postcode, property.getPostcode());
    }

    @Test
    public void testGetType() {
        assertEquals(type, property.getType());
    }

    @Test
    public void testGetBedrooms() {
        assertEquals(bedrooms, property.getBedrooms());
    }

    @Test
    public void testGetBathrooms() {
        assertEquals(bathrooms, property.getBathrooms());
    }

    @Test
    public void testGetDescription(){ assertEquals(description, property.getDescription());}
    @Test
    public void testGetGarden() {
        assertEquals(garden, property.getGarden());
    }

    @Test
    public void testGetPrice() {
        assertEquals(price, property.getPrice());
    }

    @Test
    public void testGetStatus() {
        assertEquals(status, property.getStatus());
    }
    @Test
    public void testGetSeller() {
        assertEquals(mockSeller, property.getSeller());
    }

    @Test
    public void testGetBuyer() {
        assertEquals(mockBuyer, propertyWithBuyer.getBuyer());
    }

    @Test
    public void testSetId() {
        
        property.setId(2L);
        assertEquals(2L, property.getId());
    }

    @Test
    public void testSetAddress() {
        
        String newAddress = "456 Park Ave";
        property.setAddress(newAddress);
        assertEquals(newAddress, property.getAddress());
    }

    @Test
    public void testSetPostcode() {
       
        String newPostcode = "67890";
        property.setPostcode(newPostcode);
        assertEquals(newPostcode, property.getPostcode());
    }

    @Test
    public void testSetType() {
        
        Type newType = Type.DETACHED;
        property.setType(newType);
        assertEquals(newType, property.getType());
    }

    @Test
    public void testSetBedrooms() {
        
        Integer newBedrooms = 4;
        property.setBedrooms(newBedrooms);
        assertEquals(newBedrooms, property.getBedrooms());
    }

    @Test
    public void testSetBathrooms() {
        
        Integer newBathrooms = 3;
        property.setBathrooms(newBathrooms);
        assertEquals(newBathrooms, property.getBathrooms());
    }


    @Test
    public void testSetGarden() {
        
        Boolean newGarden = false;
        property.setGarden(newGarden);
        assertEquals(newGarden, property.getGarden());
    }

    @Test
    public void testSetPrice() {
        
        Float newPrice = (float) 350000.00;
        property.setPrice(newPrice);
        assertEquals(newPrice, property.getPrice());
    }

    @Test
    public void testSetStatus() {
        Status newStatus = Status.SOLD;
        property.setStatus(newStatus);
        assertEquals(newStatus, property.getStatus());
    }


    @Test
    public void testSetSeller() {
        Seller newSeller = mock(Seller.class);
        property.setSeller(newSeller);
        assertEquals(newSeller, property.getSeller());
    }

    @Test
    public void testSetBuyer() {
        Buyer newBuyer = mock(Buyer.class);
        propertyWithBuyer.setBuyer(newBuyer);
        assertEquals(newBuyer, propertyWithBuyer.getBuyer());
    }
}












}