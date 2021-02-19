package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {

    int insertPerson(Person person);

    default int addPerson(Person person) {
        return insertPerson(person);
    }
}
