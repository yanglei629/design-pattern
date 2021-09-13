package decorator;

public class Child extends Parent {
    private int price = 5;

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getPrice());
    }
}
