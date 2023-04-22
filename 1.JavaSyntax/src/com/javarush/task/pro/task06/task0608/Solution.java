package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        long num1 = cube(2);
        System.out.println(num1);
    }

    public static long cube(long a) {
        return a * a * a;
    }

}
