package ru.raccoon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneBookTest {

    @Test
    void add() {
        PhoneBook phoneBook = new PhoneBook();
        Assertions.assertEquals(1, phoneBook.add("TestName_1", "PhoneNumber_1"));
        Assertions.assertEquals(2, phoneBook.add("TestName_2", "PhoneNumber_2"));
    }
}