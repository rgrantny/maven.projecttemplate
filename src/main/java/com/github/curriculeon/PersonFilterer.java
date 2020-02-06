package com.github.curriculeon;

import java.util.List;

/**
 * Created by leon on 2/5/2020.
 */
public class PersonFilterer implements PersonFiltererInterface {
    private List<Person> personList;

    public PersonFilterer(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public List<Person> getPeople() {
        return null;
    }
}
