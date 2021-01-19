package com.ironhack.exercise2.classes;
import com.ironhack.exercise1_3_4.classes.Person;
import java.util.List;

public class PersonList {
    // Properties
    private List<Person> personList;

    // Constructor
    public PersonList(List<Person> personList) {
        setPersonList(personList);
    }

    // FindByName
    public Person findByName (String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Nombre incorrecto");
        }
        if (name.trim().split(" ").length != 2) {
            throw new IllegalArgumentException("El nombre tiene que tener el formato; FirstName LastName");
        }
        for (Person person : this.personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    // Getters & Setters
    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
