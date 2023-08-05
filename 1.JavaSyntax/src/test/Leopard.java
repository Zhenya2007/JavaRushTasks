package test;

public class Leopard {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("ВОЗРАСТ НЕ МОЖЕТ БЫТЬ ОТРИЦАТЕЛЬНЫМ!!!");
        } else {
            this.age = age;
        }
    }

    public void growl() {
        System.out.println("Leopard growls");
    }

    public void sayHello() {
        System.out.println(" my name is " + name + " my age is " + age);
    }
}
