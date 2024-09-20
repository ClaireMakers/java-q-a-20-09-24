package org.example;

import java.util.HashMap;

public class Cat implements Animal {
    private HashMap<String, String> catInformation = new HashMap<String, String>();
    private HashMap<String, HashMap<String, String>> nestedHashmaps = new HashMap<String, HashMap<String, String>>();

    public String animalCry() {
        return "meow";
    }

    public HashMap<String, HashMap<String, String>> saveCatInformation() {
        catInformation.put("name", "Ginger");
        catInformation.put("age", "1");
        HashMap<String, String> jsonLikeHM = new HashMap<String, String>();
        jsonLikeHM.put("field", "value");
        nestedHashmaps.put("key", jsonLikeHM);
        System.out.println(nestedHashmaps.get("key").get("field"));

        return nestedHashmaps;
    }
}

// Like objects in JS - Dictionaries in Python key-value pairs
// { "name" : "Ginger",
//  }

// Like ArrayList they are a class in Java