package kr.hs.dgsw.java.c2.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    Map<String, Integer> phonebook = new HashMap<String, Integer>();

    public void add(String name, Integer phone) {

    }

    public void nameSearch(String name) {

    }

    public void delete(String name) {

    }

    public void allPrint() {
        Set<String> keys = phonebook.keySet();
        Collection<Integer> values = phonebook.values();


    }

    public static void main(String[] args) {

    }
}
