package com.example.MongoDemo.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@EqualsAndHashCode
@Document(collation = "person")
public class Person extends AbstractDocument {
    private String firstName;
    private String lastName;
    private int age;


}
