package com.example.MongoDemo.service;

import com.example.MongoDemo.dao.DemoDao;
import com.example.MongoDemo.model.Demo;
import com.example.MongoDemo.repositories.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DemoService {
    @Autowired
    private DemoRepository demoRepository;

    public void addDemoObject(Demo d){
        demoRepository.save(d);
    }


}
