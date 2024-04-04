package com.qa.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Properties {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String address;
    @Column
    private String postcode;
    @Column
    private Type type;
    @Column
    private int bedrooms;
    @Column
    private int bathrooms;
    @Column
    private boolean garden;
    @Column
    private float price;
    @Column
    private Status status;
    @Column
    private String description;
    @Column
    private String thumbnail;

    @Column
    private String img2;
    @Column
    private String img3;
    @Column
    private String img4;
    @Column
    private String img5;
    @Column
    private String img6;
    @Column
    private String img7;
    @Column
    private String img8;
    @Column
    private String img9;

    private long buyerId;

    private long sellerId;


    //private com.qa.project.entities.Seller Seller;
    //private com.qa.project.entities.Buyer Buyer;

    public Properties(Long id, String address, String postcode, Type type, Integer bedrooms, Integer bathrooms,
                      String description, Boolean garden, Float price, String thumbnail, String img2, String img3, String img4,
                      String img5, String img6, String img7, String img8, String img9, String url, Status status, Seller mockSeller) {
        // Empty constructor required by JPA
    }

    // Constructor with parameters
    public Properties(String address, String postcode, Type type, int bedrooms, int bathrooms,
                      boolean garden, float price, Status status, String description, String thumbnail,
                      String img2, String img3, String img4, String img5, String img6, String img7,
                      String img8, String img9, Seller mockSeller, Buyer mockBuyer) {
        this.address = address;
        this.postcode = postcode;
        this.type = type;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.garden = garden;
        this.price = price;
        this.status = status;
        this.description = description;
        this.thumbnail = thumbnail;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
        this.img9 = img9;
    }

    //public Properties(Long id, String address, String postcode, Type type, Integer bedrooms, Integer bathrooms, String description, Boolean garden, Float price, Status status, com.qa.project.entities.Seller mockSeller) {



    // Getters
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getBedrooms() {
        return this.bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }


    public int getBathrooms() {
        return this.bathrooms;
    }

    public void setBathrooms( int bathrooms) {
        this.bathrooms = bathrooms;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public boolean getGarden() {
        return this.garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }


    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    public float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = this.price;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }


    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }




    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public String getImg5() {
        return img5;
    }

    public void setImg5(String img5) {
        this.img5 = img5;
    }

    public String getImg6() {
        return img6;
    }

    public void setImg6(String img6) {
        this.img6 = img6;
    }

    public String getImg7() {
        return img7;
    }

    public void setImg7(String img7) {
        this.img7 = img7;
    }

    public String getImg8() {
        return img8;
    }

    public void setImg8(String img8) {
        this.img8 = img8;
    }

    public String getImg9() {
        return img9;
    }

    public void setImg9(String img9) {
        this.img9 = img9;
    }


    public long getSeller() {
        return sellerId;
    }

    public long setSeller(long sellerId) {
        this.sellerId = sellerId;
        return sellerId;
    }

    public long getBuyer() {
        return buyerId;
    }

    public long setBuyer(long buyerId) {
        this.buyerId = buyerId;
        return buyerId;
    }
}

   

   




