package com.qa.project;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.project.entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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


    private final long mockSeller = 1L;

    private final long mockBuyer = 1L;

//    private Properties property;
    private static final Long id = 1L;
    private static final String address = "123 Main St";
    private static final String postcode = "12345";
    private static final Type type = Type.APARTMENT;
    private static final Integer bedrooms = 4;
    private static final Integer bathrooms = 3;
    private static final String description = "The best house on the street";
    private static final Boolean garden = true;
    private static final Float price = (float) 300.00;
    private  static final Status status = Status.FORSALE;

    private static final String thumbnail = "https://www.rd.com/wp-content/uploads/2019/11/cat-10-e1573844975155.jpg?fit=700,700";
    private static final String img2 = "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg";
    private static final String img3 = "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg";
    private static final String img4 = "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg";
    private static final String img5 = "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg";
    private static final String img6 = "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg";
    private  static final String img7 = "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg";
    private static final String img8 = "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg";
    private static final String img9 = "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg";

    public static Properties property = new Properties("123 Main St", "12345", Type.APARTMENT, 4 ,3,
             true,   300.00F, Status.FORSALE, "The best house on the street",
            "https://www.rd.com/wp-content/uploads/2019/11/cat-10-e1573844975155.jpg?fit=700,700",
            "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
            "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
            "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
            "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
            "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
            "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
            "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
            "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg"
            );

    public static Properties propertyWithBuyer = new Properties(address, postcode, type, bedrooms,
                bathrooms, garden, price, status, description, thumbnail, img2 ,img3, img4, img5,
                img6, img7, img8, img9);
//    @BeforeEach
//    public void setUp() {
//        when(mockSeller.getId()).thenReturn(id);
//        when(mockSeller.getAddress()).thenReturn(address);
//        when(property.getDescription()).thenReturn(description);



//        property = new Properties(id, address, postcode, type, bedrooms, bathrooms,
//                description, garden, price,thumbnail,img2 ,img3, img4, img5,
//                img6, img7, img8, img9, "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg", status, mockSeller);
//        Properties noBuyer = new Properties(1L,"123 Main St", "12345",Type.APARTMENT,  4 ,3,
//               "The best house on the street", true, (float) 3000.00,
//               "https://www.rd.com/wp-content/uploads/2019/11/cat-10-e1573844975155.jpg?fit=700,700",
//               "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
//                "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
//                "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
//                "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
//                "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
//                "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
//                "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
//                "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
//                "https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1240w,f_auto,q_auto:best/streams/2013/May/130522/6C7536084-g-hlt-120105-puppy-423p.jpg",
//                Status.FORSALE, mockSeller);

    ;



    @Test
    public void testDefaultConstructor() throws Exception {
        Properties defaultProperty = new Properties(address, postcode, type, bedrooms, bathrooms, garden, price, status, description,
                thumbnail,img2 ,img3, img4, img5,
                img6, img7, img8, img9);
        assertNotNull(defaultProperty);
        System.out.println(defaultProperty.getDescription());
    }


    @Test
    public void testNoBuyerConstructor() {
        assertNotNull(property);
        assertEquals(address, property.getAddress());
        assertEquals(postcode, property.getPostcode());
        assertEquals(type, property.getType());
        assertEquals(bedrooms, property.getBedrooms());
        assertEquals(bathrooms, property.getBathrooms());
        assertEquals(description,property.getDescription());
        assertEquals(garden, property.getGarden());
        assertEquals(price, property.getPrice());
        assertEquals(thumbnail, property.getThumbnail());
        assertEquals(img2, property.getImg2());
        assertEquals(img3, property.getImg3());
        assertEquals(img4, property.getImg4());
        assertEquals(img5, property.getImg5());
        assertEquals(img6, property.getImg6());
        assertEquals(img7, property.getImg7());
        assertEquals(img8, property.getImg8());
        assertEquals(img9, property.getImg9());
        assertEquals(status, property.getStatus());
    }

    @Test
    public void testAllArgumentsConstructor() {
//        assertNotNull(propertyWithBuyer);
        assertEquals(address, propertyWithBuyer.getAddress());
        assertEquals(postcode, propertyWithBuyer.getPostcode());
        assertEquals(type, propertyWithBuyer.getType());
        assertEquals(bedrooms, propertyWithBuyer.getBedrooms());
        assertEquals(bathrooms, propertyWithBuyer.getBathrooms());
        assertEquals(description, propertyWithBuyer.getDescription());
        assertEquals(garden, propertyWithBuyer.getGarden());
        assertEquals(price, propertyWithBuyer.getPrice());
        assertEquals(thumbnail, property.getThumbnail());
        assertEquals(img2, propertyWithBuyer.getImg2());
        assertEquals(img3, propertyWithBuyer.getImg3());
        assertEquals(img4, propertyWithBuyer.getImg4());
        assertEquals(img5, propertyWithBuyer.getImg5());
        assertEquals(img6, propertyWithBuyer.getImg6());
        assertEquals(img7, propertyWithBuyer.getImg7());
        assertEquals(img8, propertyWithBuyer.getImg8());
        assertEquals(img9, propertyWithBuyer.getImg9());
        assertEquals(status, propertyWithBuyer.getStatus());
    }

//    @Test
//    public void testGetId() {
//        assertEquals(id, property.getId());
//    }
//
//    @Test
//    public void testGetAddress() {
//        assertEquals(address, property.getAddress());
//    }
//
//    @Test
//    public void testGetPostcode() {
//        assertEquals(postcode, property.getPostcode());
//    }
//
//    @Test
//    public void testGetType() {
//        assertEquals(type, property.getType());
//    }
//
//    @Test
//    public void testGetBedrooms() {
//        assertEquals(bedrooms, property.getBedrooms());
//    }
//
//    @Test
//    public void testGetBathrooms() {
//        assertEquals(bathrooms, property.getBathrooms());
//    }
//
//    @Test
//    public void testGetDescription(){ assertEquals(description, property.getDescription());}
//    @Test
//    public void testGetGarden() {
//        assertEquals(garden, property.getGarden());
//    }
//
//    @Test
//    public void testGetPrice() {
//        assertEquals(price, property.getPrice());
//    }
//
//    @Test
//    public void testGetStatus() {
//        assertEquals(status, property.getStatus());
//    }
//    @Test
//    public void testGetSeller() {
//        assertEquals(mockSeller, property.getSeller());
//    }
//
//    @Test
//    public void testGetBuyer() {
//        assertEquals(mockBuyer, propertyWithBuyer.getBuyer());
//    }

//    @Test
//    public void testSetId() {
//
//        property.setId(1L);
//        assertEquals(1L, property.getId());
//    }

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
    public void testSetDescription(){
        String newDescription =  "The worst house in the world";
        property.setDescription(newDescription);
        assertEquals(newDescription, property.getDescription());
    }


    @Test
    public void testSetGarden() {

        Boolean newGarden = false;
        property.setGarden(newGarden);
        assertEquals(newGarden, property.getGarden());
    }

    @Test
    public void testSetPrice() {

        Float newPrice = (float) 000.00;
        property.setPrice(newPrice);
        assertEquals(newPrice, property.getPrice());
    }
    @Test
    public void testSetThumbnail(){
        String newThumbnail =  "https://picture/CatorDog/primary_image";
        property.setThumbnail(newThumbnail);
        assertEquals(newThumbnail, property.getThumbnail());
    }

    @Test
    public void testSetImg2(){
        String newImg2 =  "https://picture/CatorDog/primary_image";
        property.setImg2(newImg2);
        assertEquals(newImg2, property.getImg2());
    }
    @Test
    public void testSetImg3(){
        String newImg3 =  "https://picture/CatorDog/primary_image";
        property.setImg3(newImg3);
        assertEquals(newImg3, property.getImg3());
    }

    @Test
    public void testSetImg4(){
        String newImg4 =  "https://picture/CatorDog/primary_image";
        property.setImg4(newImg4);
        assertEquals(newImg4, property.getImg4());
    }

    @Test
    public void testSetImg5(){
        String newImg5 =  "https://picture/CatorDog/primary_image";
        property.setImg5(newImg5);
        assertEquals(newImg5, property.getImg5());
    }

    @Test
    public void testSetImg6(){
        String newImg6 =  "https://picture/CatorDog/primary_image";
        property.setImg6(newImg6);
        assertEquals(newImg6, property.getImg6());
    }

    @Test
    public void testSetImg7(){
        String newImg7 =  "https://picture/CatorDog/primary_image";
        property.setImg7(newImg7);
        assertEquals(newImg7, property.getImg7());
    }

    @Test
    public void testSetImg8(){
        String newImg8 =  "https://picture/CatorDog/primary_image";
        property.setImg8(newImg8);
        assertEquals(newImg8, property.getImg8());
    }

    @Test
    public void testSetImg9(){
        String newImg9 =  "https://picture/CatorDog/primary_image";
        property.setImg9(newImg9);
        assertEquals(newImg9, property.getImg9());
    }



    @Test
    public void testSetStatus() {
        Status newStatus = Status.SOLD;
        property.setStatus(newStatus);
        assertEquals(newStatus, property.getStatus());
    }


//    @Test
//    public void testSetSeller() {
//        Seller newSeller = mock(Seller.class);
//        property.setSeller(newSeller);
//        assertEquals(newSeller, property.getSeller());
//    }
//
//    @Test
//    public void testSetBuyer() {
//        Buyer newBuyer = mock(Buyer.class);
//        propertyWithBuyer.setBuyer(newBuyer);
//        assertEquals(newBuyer, propertyWithBuyer.getBuyer());
//    }
}












