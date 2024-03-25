package services;

import Repo.PropertiesRepo;
import com.qa.project.entities.Properties;
import com.qa.project.entities.Status;
import com.qa.project.entities.Type;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Service
public class PropertiesService{

    private PropertiesRepo repo;

    public Properties add(Properties properties){
        return repo.save(properties);
    }

    public void PropertiesController(PropertiesService repo){
        this.repo = (PropertiesRepo) repo;
    }

    public List<Properties> getAll(){
        return this.repo.findAll();
    }

    public Properties get(int id){
        return this.repo.findAllById(id);
    }

    public Properties create( Properties properties){
        return this.repo.save(properties);
    }


    public Properties remove(int id){
        Properties removedItem = this.repo.findAllById(id);
        this.repo.deleteById(id);
        return removedItem;
    }


    public Properties update (int id, String address,  String postcode,
                                        Type type,  Integer bedrooms, Integer bathrooms,
                                        boolean garden, Status status, Float price, String thumbnail, String description){
        Properties toUpdate = this.repo.findAllById(id);

        if(address != null) toUpdate.setAddress(address);
        if(postcode != null) toUpdate.setPostcode(postcode);
        if(type != null) toUpdate.setType();
        if(bedrooms != null) toUpdate.setBedrooms();
        if(bathrooms!= null) toUpdate.setBathrooms();
        if(status != null) toUpdate.setStatus ();
        if (price != null)  toUpdate.setPrice(); // test to see if price < 0 still work
        if (description != null)  toUpdate.setPrice();
        if (thumbnail != null)  toUpdate.setThumbnail();


        return this.repo.save(toUpdate);
    }
}
