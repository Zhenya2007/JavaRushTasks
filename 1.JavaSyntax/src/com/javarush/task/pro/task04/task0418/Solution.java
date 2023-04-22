package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextBoolean()) {
           double ceil = Math.ceil(glass);
           System.out.println((int) ceil);
        } else {
            double floor = Math.floor(glass);
            System.out.println((int) floor);
        }

    }
}