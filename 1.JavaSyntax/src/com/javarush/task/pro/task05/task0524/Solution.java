package com.javarush.task.pro.task05.task0524;

/* 
Взлом Кибердракона
*/

import java.util.Arrays;

public class Solution {
    public static int[] coordinates;

    public static void main1(String[] args) {
        coordinates = new int[200];
        for (int i = 0; i < coordinates.length; i++) {
            if (i % 2 != 0) {
                coordinates[i] = coordinates[i - 1] + 1;
            } else if (i != 0) {
                coordinates[i] = coordinates[i - 2] + 10;
            }
        }
        System.out.println(Arrays.toString(coordinates));
    }

    public static void main(String[] args) {
        coordinates = new int[200];
        for (int i = 0; i < coordinates.length / 2; i++) {
            coordinates[i * 2] = i * 10;
            coordinates[i * 2 + 1] = i * 10 + 1;
        }
        System.out.println(Arrays.toString(coordinates));
    }
}