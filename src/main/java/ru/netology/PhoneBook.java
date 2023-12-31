package ru.netology;

import java.util.*;

public class PhoneBook {
    private Map<String, String> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public int add(String name, String phoneNumber) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, phoneNumber);
            return contacts.size();
        }
        return contacts.size();
    }

    public String findByNumber(String phoneNumber) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String findByName(String name) {
        return contacts.get(name);
    }

    public List<String> printAllNames() {
        List<String> names = new ArrayList<>(contacts.keySet());
        Collections.sort(names);
        return names;
    }
}