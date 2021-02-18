package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public class FakePersonDataAccessService implements PersonDao  {
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public int addPerson(Person person) {
        return 0;
    }
}
