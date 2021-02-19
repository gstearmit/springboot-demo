package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao  {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(Person person) {
        DB.add(new Person(person.getName()));
        return 0;
    }

    @Override
    public int addPerson(Person person) {
        return 0;
    }
}
