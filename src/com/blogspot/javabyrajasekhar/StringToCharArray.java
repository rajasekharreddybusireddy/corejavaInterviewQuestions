package com.blogspot.javabyrajasekhar;

public class StringToCharArray {
    public static void main(String[] args) {
        String name="JavaQuestions";
        System.out.println("by using builtin functions-------------------------");
        builtinFunction(name);
        System.out.println("my own logic------------------------");
        myownLogic( name);
    }

    private static void builtinFunction(String name) {
        char[] chars = name.toCharArray();
        for (int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }
    }
    private static void myownLogic(String name) {
        char []mychar =new char[name.length()];
        for (int i=0;i<name.length();i++){
            mychar[i]=name.charAt(i);
        }
        for (int i=0;i<mychar.length;i++){
            System.out.println(mychar[i]);
        }
    }
}
