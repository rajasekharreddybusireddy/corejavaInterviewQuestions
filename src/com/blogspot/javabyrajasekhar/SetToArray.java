package com.blogspot.javabyrajasekhar;

import java.util.HashSet;

public class SetToArray {
    public static void main(String[] args) {
        HashSet<String> mobilesSet = new HashSet<>();
        mobilesSet.add("nokia");
        mobilesSet.add("redmi");
        mobilesSet.add("asus");
        mobilesSet.add("lenova");
        mobilesSet.add("iphone");

       // mobilesSet.forEach(System.out::println);

        String mobileArray[]=new String[mobilesSet.size()];

        String[] mobiles = mobilesSet.toArray(mobileArray);
        for (String mobile:mobiles
             ) {
            System.out.println(mobile);
        }

    }
}
