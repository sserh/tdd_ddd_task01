package ru.raccoon;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, String> phoneBookMap = new HashMap<>();
    public int add(String name, String phoneNumber) {
        phoneBookMap.put(name, phoneNumber); //добавим запрошенный контакт в мапу
        //вернём размер мапы
        return phoneBookMap.size();
    }
}
