package com.qa.project.rest;

import com.qa.project.entities.Properties;
import com.qa.project.entities.Status;
import com.qa.project.entities.Type;
import org.springframework.web.bind.annotation.*;
import services.PropertiesService;

import java.util.ArrayList;
import java.util.List;
@RequestMapping("/Properties")
@RestController
public class PropertiesController {

    private final PropertiesService service;
    public PropertiesController(PropertiesService service){
        this.service = service;
    }
    /*
       @GetMapping("/getAll")
        public List<Properties> getAll(){
            Type example = Type.APARTMENT;
            System.out.println(example);



            Properties exampleProperty = new Properties();
            exampleProperty.setType(Type.APARTMENT);

            System.out.println(exampleProperty.getType());
            return this.property;
        }


    */
    @GetMapping("/getAll")
   public List<Properties> getAll(){
         return this.service.getAll();
   }
    @GetMapping("/getProperties/{id}")
    public Properties getProperties(@PathVariable("id") int id){
        return this.service.get(id);
    }
    @PostMapping("/create")
    public List<Properties> createProperties(@RequestBody Properties properties){
        this.service.add(properties);
        //change this to create JSON description of result
        return this.service.getAll();//this.service.size()-1);
    }

    @DeleteMapping("/delete")
    public Properties removeProperties(@PathVariable("id") int id){
        //change this to return JSON confirmation of database record delete
        return this.service.remove(id);
    }


    @PatchMapping("/update/{id}")
    public Properties updateProperties (@PathVariable int id, @RequestParam(required = false) String address, @RequestParam (required = false) String postcode,
                                        @RequestParam(required = false) Type type, @RequestParam Integer bedrooms, @RequestParam Integer bathrooms,
                                        boolean garden, Status status, Float price, String thumbnail, String description){
        Properties toUpdate = this.service.get(id);
        if(address != null) toUpdate.setAddress(address);
        if(postcode != null) toUpdate.setPostcode(postcode);
        if(type != null) toUpdate.setType();
        if(bedrooms != null) toUpdate.setBedrooms();
        if(bathrooms!= null) toUpdate.setBathrooms();
        if(status != null) toUpdate.setStatus ();
        if (price != null)  toUpdate.setPrice(); // test to see if price < 0 still work
        if (description != null)  toUpdate.setPrice();
        if (thumbnail != null)  toUpdate.setThumbnail();


        return this.service.update(id, address, postcode,
                type, bedrooms, bathrooms,
        garden,status, price,thumbnail, description);
    }



}
