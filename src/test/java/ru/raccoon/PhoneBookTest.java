package ru.raccoon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneBookTest {

    @Test
    void add() {
        PhoneBook phoneBook = new PhoneBook();

        Assertions.assertEquals(1, phoneBook.add("TestName_1", "PhoneNumber_1"));
        Assertions.assertEquals(2, phoneBook.add("TestName_2", "PhoneNumber_2"));
        Assertions.assertEquals(3, phoneBook.add("TestName_3", "PhoneNumber_3"));
    }

    @Test
    void findByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("TestName_1", "PhoneNumber_1");
        phoneBook.add("TestName_2", "PhoneNumber_2");
        phoneBook.add("TestName_3", "PhoneNumber_3");

        Assertions.assertEquals("TestName_1", phoneBook.findByNumber("PhoneNumber_1"));
        Assertions.assertEquals("TestName_2", phoneBook.findByNumber("PhoneNumber_2"));
        Assertions.assertEquals("TestName_3", phoneBook.findByNumber("PhoneNumber_3"));
    }
}