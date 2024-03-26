package com.qa.project.services;

import com.qa.project.Repo.PropertiesRepo;
import com.qa.project.entities.Properties;
import com.qa.project.entities.Status;
import com.qa.project.entities.Type;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertiesService{

    private PropertiesRepo repo;
    private Properties properties;

    public void add(Properties properties){
        this.properties = properties;
        repo.save(properties);
    }

    public  PropertiesService(PropertiesRepo repo){
        this.repo = repo;
    }

    public List<Properties> getAll(){
        return this.repo.findAll();
    }

    public Properties get(int id){
        return this.repo.findById(id).get();
    }

    public Properties create( Properties properties){
        return this.repo.save(properties);
    }


    public Properties remove(int id){
        Properties removedItem = this.get(id);
        this.repo.deleteById(id);
        return removedItem;
    }


    public Properties update (int id, String address, String postcode,
                              Type type, Integer bedrooms, Integer bathrooms,
                              boolean garden, Status status, Float price, String thumbnail,
                              String description, String img2, String img3, String img4,
                              String img5, String img6, String img7, String img8, String img9){
        Properties toUpdate = this.repo.findById(id).get();

        if(address != null) toUpdate.setAddress(address);
        if(postcode != null) toUpdate.setPostcode(postcode);
        if(type != null) toUpdate.setType(type);
        if(bedrooms != null) toUpdate.setBedrooms(bedrooms);
        if(bathrooms!= null) toUpdate.setBathrooms(bathrooms);
        if(status != null) toUpdate.setStatus (status);
        if (price != null)  toUpdate.setPrice(price); // test to see if price < 0 still work
        if (description != null)  toUpdate.setDescription(description);
        if (thumbnail != null)  toUpdate.setThumbnail(thumbnail);
        if (img2 != null)  toUpdate.setImg2(img2);
        if (img3 != null)  toUpdate.setImg3(img3);
        if (img4 != null)  toUpdate.setImg4(img4);
        if (img5 != null)  toUpdate.setImg5(img5);
        if (img6 != null)  toUpdate.setImg6(img6);
        if (img7 != null)  toUpdate.setImg7(img7);
        if (img8 != null)  toUpdate.setImg8(img8);
        if (img9 != null)  toUpdate.setImg9(img9);



        return this.repo.save(toUpdate);
    }
}
