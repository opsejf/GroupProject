package com.qa.project.rest;

import com.qa.project.entities.Properties;
import com.qa.project.entities.Status;
import com.qa.project.entities.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import com.qa.project.services.PropertiesService;

import java.util.List;
@Repository
@RequestMapping("/Properties")
@RestController
public class PropertiesController {



    @Autowired
    private PropertiesService service;
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
    public Properties getProperties(@PathVariable int id){
        return this.service.get(id);
    }
    @PostMapping("/create-property")
    public Properties createProperties(@RequestBody Properties properties){
        //this.service.add(properties);
        //change this to create JSON description of result
        return this.service.create(properties);//this.service.size()-1);
    }

    @DeleteMapping("/delete-property/{id}")
    public Properties removeProperties(@PathVariable int id){
        //change this to return JSON confirmation of database record delete
        return this.service.remove(id);
    }


    @PatchMapping("/update-property/{id}")
    public Properties update (@PathVariable int id, @RequestParam(required = false) String address, @RequestParam (required = false) String postcode,
                                        @RequestParam(required = false) Type type, @RequestParam Integer bedrooms, @RequestParam Integer bathrooms,
                                        boolean garden, Status status, Float price, String thumbnail, String description, String img2, String img3,
                                        String img4, String img5, String img6, String img7, String img8, String img9){

       // if (thumbnail != null)  toUpdate.setThumbnail();


        return this.service.update(id, address, postcode,
                type, bedrooms, bathrooms,
        garden,status, price,thumbnail, description,
                img2, img3, img4, img5, img6, img7, img8, img9);
    }



}
