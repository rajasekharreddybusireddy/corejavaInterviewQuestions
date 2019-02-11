package com.blogspot.javabyrajasekhar;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("rajasekhar");
        names.add("anil");
        names.add("srinu");
        names.add("jhon");

        /*
        names.forEach(System.out::println);
        System.out.println("-------------------------");
        String namesArray[]=new String[names.size()];
        String[] name = names.toArray(namesArray);

        for (String s:name
             ) {
            System.out.println(s);
        } */

        ListToArray.myListToArray(names);
    }

    public static void myListToArray(List<String> list){

        String nameArray[]=new String[list.size()];
        for (int i=0;i<list.size();i++){
            nameArray[i]=list.get(i);
        }

        for (String s:nameArray
        ) {
            System.out.println(s);
        }
    }
}
