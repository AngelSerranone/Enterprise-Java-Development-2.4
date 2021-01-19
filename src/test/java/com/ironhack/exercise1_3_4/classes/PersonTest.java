package com.ironhack.exercise1_3_4.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person persona1; // para poder acceder a el.
    private Person persona2;

    @BeforeEach
    public void setUp() {
        persona1 = new Person(3,"Juan", 20, "Jardinero");
        persona2 = new Person(3,"Pedro", 24, "Juez");
    }
    @Test
    void setAge_ageBelowZero_NullPointerException() {
        assertThrows(NullPointerException.class, () -> persona1.setAge(-2));
    }
    @Test
    void setAge_ageCorrect_setAge() {
        persona1.setAge(30);
        assertEquals(30, persona1.getAge());
    }

    @Test
    void testClone_clonedPersonId_IdPlusOne() {
        assertEquals(4, persona1.clone(persona1).getId());
    }
    @Test
    void testClone_equalPersons_true() {
        assertEquals(true, persona1.equals(persona1.clone(persona1)));
    }
    @Test
    void testClone_notEqualPersons_false() {
        assertEquals(false, persona1.equals(persona1.clone(persona2)));
    }
}