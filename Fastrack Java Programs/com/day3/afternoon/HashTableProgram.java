package com.day3.afternoon;

import java.util.Hashtable;
import java.util.Map;

public class HashTableProgram {

    public static void main(String[] args) {
        // Create a Hashtable of String keys and Integer values
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        
        // Adding elements to the Hashtable
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        
        // Displaying the Hashtable elements
        System.out.println("Hashtable Elements: " + hashtable);
        
        // Iterating through the Hashtable and displaying key-value pairs
        for (Map.Entry<String, Integer> e : hashtable.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}

