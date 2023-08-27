package com.example.MongoDemo.dao;

import com.example.MongoDemo.model.Demo;
import com.example.MongoDemo.repositories.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoDaoImpl implements DemoDao {
    @Autowired
    private DemoRepository demoRepository;
    public void addDemo(Demo d){
        demoRepository.save(d);
    }
}
