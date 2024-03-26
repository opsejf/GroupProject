package com.qa.project.Repo;

import com.qa.project.entities.Properties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;


@Repository
public interface PropertiesRepo extends JpaRepository<Properties, Integer> {
    //Properties findAllById(int id);
}
