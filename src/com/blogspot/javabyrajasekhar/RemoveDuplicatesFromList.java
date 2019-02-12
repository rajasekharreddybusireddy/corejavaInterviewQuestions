package com.blogspot.javabyrajasekhar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("one"); //duplicate
        numbers.add("one");//duplicate
        numbers.add("four");
        numbers.forEach(System.out::println);

        System.out.println("no order after removing duplicates---------------------------------");
        ArrayList<String> list = new ArrayList<>(new HashSet<String>(numbers));//no order
        list.forEach(System.out::println);

        System.out.println("order after removing duplicates-------------------------------");
        ArrayList<String> insertionOrderList = new ArrayList<>(new LinkedHashSet<>(numbers));//by order
        insertionOrderList.forEach(System.out::println);
    }
}
