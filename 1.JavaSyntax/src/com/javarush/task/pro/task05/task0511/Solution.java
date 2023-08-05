package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        multiArray = new int[num1][];
        for (int i = 0; i < num1; i++) {
            int num2 = scanner.nextInt();
            multiArray[i] = new int[num2];
        }
        System.out.println(Arrays.deepToString(multiArray));
    }
}
