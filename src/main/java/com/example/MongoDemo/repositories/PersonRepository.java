package com.example.MongoDemo.repositories;

import com.example.MongoDemo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;


public interface PersonRepository extends MongoRepository<Person, BigInteger> {
    public Person findByFirstName(String firstName);
    public Person findByLastName(String lastName);

}
