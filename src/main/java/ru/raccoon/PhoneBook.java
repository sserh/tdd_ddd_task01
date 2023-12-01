package ru.raccoon;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, String> phoneBookMap = new HashMap<>();
    Map<String, String> reversePhoneBookMap = new HashMap<>();
    public int add(String name, String phoneNumber) {
        //добавим запрошенный контакт в мапу
        phoneBookMap.put(name, phoneNumber);
        //будем добавлять записи ещё и в дополнительную мапу, чтобы удовлетворить требованию задачи по поиску "без полного перебора"
        reversePhoneBookMap.put(phoneNumber, name);
        //вернём размер мапы
        return phoneBookMap.size();
    }

    public String findByNumber(String phoneNumber) {

        return reversePhoneBookMap.get(phoneNumber);
    }

    public String findByName(String name) {
        return null;
    }

}
