package com.github.curriculeon;

import java.util.List;

/**
 * Created by leon on 2/5/2020.
 */
public interface PersonFiltererInterface {
    List<Person> getPeople();

    default Person findById(Long id) {
        return getPeople()
                .stream()
                .filter(person -> person.getId().equals(id))
                .findFirst()
                .get();
    }
}
