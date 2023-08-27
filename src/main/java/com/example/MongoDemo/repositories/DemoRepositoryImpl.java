package com.example.MongoDemo.repositories;

import com.example.MongoDemo.model.Demo;
import com.mysql.cj.xdevapi.*;

import java.util.Optional;

public class DemoRepositoryImpl implements DemoRepository {
    Session mySession = new SessionFactory().getSession("mysqlx://localhost:33060/demo?user=root&password=tulasi123**");

    Schema myDb = mySession.getSchema("demo");

    Collection myColl = myDb.getCollection("my_collection");

    @Override
    public <S extends Demo> S save(S entity) {
        DbDoc d = new DbDocImpl().add("name", new JsonString().setValue(entity.getName()))
                .add("age", new JsonNumber().setValue(String.valueOf(entity.getAge())))
                .add("isStudent",entity.isStudent()? JsonLiteral.TRUE : JsonLiteral.FALSE );

        myColl.add(d).execute();
        return entity;
    }

    @Override
    public <S extends Demo> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Demo> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<Demo> findAll() {
        return null;
    }

    @Override
    public Iterable<Demo> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Demo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Demo> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
