package net.hackyle.service;

import net.hackyle.pojo.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {
    //增
    void addPerson(Person person);

    //删
    void deletePerson(int id);

    //改
    void updatePerson(Person person);

    //查
    List<Person> readAllPerson();
}
