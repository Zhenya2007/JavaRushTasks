package com.javarush.task.pro.task06.task0616;

/* 
Учет работников
*/

public class Solution {
    public String name = "Amigo";
    public String position = "Java developer";
    private int salary = 10_000;

    public void setPosition(String position) {
        position = position;
    }

    public void setSalary(int salary) {
        salary = salary;
    }

}

class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.salary);
        solution.salary = 48;
        System.out.println(solution.salary);
    }

}
