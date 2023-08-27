package com.example.MongoDemo.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Demo {
    private String name;
    private int age;
    private boolean isStudent;


}
