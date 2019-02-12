package com.blogspot.javabyrajasekhar;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int []numbers=new int[]{9,4,15,36,11,5,4,3,14};
        System.out.println("built in functions--------------------");
        arraySortingByusingBuiltinFunctions(numbers);
        System.out.println("my own sorting--------------------");
        arraySortingByusingMyOwnLogic(numbers);

    }

    public static void arraySortingByusingBuiltinFunctions(int[] numbers) {
        Arrays.sort(numbers);
        for (int i=numbers.length-1;i>0;i--){
            System.out.println(numbers[i]);
        }
    }

    public static void arraySortingByusingMyOwnLogic(int[] numbers) {
        for (int i=0;i<numbers.length;i++){
         for (int j=i+1;j<numbers.length;j++){
             if(numbers[i]< numbers[j]){
                 int a=numbers[i];
                 numbers[i]=numbers[j];
                 numbers[j]=a;
             }
         }
        }

        for (int n:numbers
             ) {
            System.out.println(n);
        }
    }
}
