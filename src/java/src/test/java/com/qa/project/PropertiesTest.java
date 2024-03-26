package com.qa.project;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.project.entities.Properties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

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






}