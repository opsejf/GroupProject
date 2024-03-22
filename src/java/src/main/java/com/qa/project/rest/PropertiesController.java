package com.qa.project.rest;

import com.qa.project.entities.Properties;
import com.qa.project.entities.Type;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PropertiesController {
    private List<Properties> property = new ArrayList<>();

    @GetMapping("/getAll")
    public List<Properties> getAll(){
        Type example = Type.APARTMENT;
        System.out.println(example);



        Properties exampleProperty = new Properties();
        exampleProperty.setType(Type.APARTMENT);

        System.out.println(exampleProperty.getType());
        return this.property;
    }

}
