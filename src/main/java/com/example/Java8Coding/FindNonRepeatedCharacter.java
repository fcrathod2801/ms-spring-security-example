package com.example.Java8Coding;

import java.util.HashMap;
import java.util.Map;

public class FindNonRepeatedCharacter {
    public static void main(String [] args) {
        String str = "hello worldh";
        //find first non repeated character in string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("First non repeated character is: " + c);
                break;
            }
        }
        //find first non repeated character in string using stream
        str.chars().mapToObj(c -> (char) c).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().ifPresent(c -> System.out.println("First non repeated character is: " + c));
        //find first non repeated character in string using stream and lambda expression
str
        .chars()
        .mapToObj(c -> (char) c)
        .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
        .findFirst()
        .ifPresent(c -> System.out.println("First non repeated character is: " + c));

//find first non repeated character in string using stream and lambda expression and method reference
        str
                .chars()
                .mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst()
                .ifPresent(System.out::println);


        // using hashmap
              Map<Character, Integer> map = new HashMap<>();
                for (char c : str.toCharArray()) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
                for (char c : str.toCharArray()) {
                    if (map.get(c) == 1) {
                        System.out.println("First non repeated character is: " + c);
                        break;
                    }
                }
    }
}
