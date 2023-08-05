package test;

public class Test {
    public static void main(String[] args) {
        Leopard leopard = new Leopard();
        leopard.growl();
        leopard.setName("leo");
        leopard.setAge(5);
        leopard.sayHello();

        Leopard leopard2 = new Leopard();
        leopard2.setName("кристи");
        leopard2.setAge(-4);
        leopard2.sayHello();

    }
}
