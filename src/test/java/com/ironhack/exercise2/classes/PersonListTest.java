package com.ironhack.exercise2.classes;

import com.ironhack.exercise1_3_4.classes.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonListTest {
    private static PersonList personObject;
    private static List<Person> personList;

    @BeforeAll
    public static void setUp() {
        System.out.println("Testing PersonList");
        personList = new ArrayList<>();
        personList.add(new Person(123, "Juan Cano", 23, "jardinero"));
        personList.add(new Person(2345, "Pedro Picapiedra", 26, "conserje"));
        personList.add(new Person(2345, "Elvira Lindo", 20, "barman"));

        personObject = new PersonList(personList);
    }

    @Test
    void findByName_emptyOrNull_IllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> {personObject.findByName("");});
    }
    @Test
    void findByName_namePresent_getperson(){
        assertEquals(personList.get(0), personObject.findByName("Juan Cano"));
    }
    @Test
    void findByName_nameNotPresent_Null(){
        assertEquals(null, personObject.findByName("Juan García"));
    }
    @Test
    void findByName_notLastname_Null(){
        assertThrows(IllegalArgumentException.class, () -> {personObject.findByName("Julián");});
    }
}