package com.example.MongoDemo.repositories;

import com.example.MongoDemo.model.Demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends CrudRepository<Demo, String> {

}
