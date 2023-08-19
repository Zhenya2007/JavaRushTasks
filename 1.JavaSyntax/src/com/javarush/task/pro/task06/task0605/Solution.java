package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/

public class Solution {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
//        int temp0 = array[0];
//        array[0] = array[array.length - 1];
//        array[array.length - 1] = temp0;
//
//        int temp1 = array[1];
//        array[1] = array[array.length - 2];
//        array[array.length - 2] = temp1;
//
//        int temp2 = array[2];
//        array[2] = array[array.length - 3];
//        array[array.length - 3] = temp2;
//
//        int temp3 = array[3];
//        array[3] = array[array.length - 4];
//        array[array.length - 4] = temp3;

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
