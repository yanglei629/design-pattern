package strategy;

public class Client {
    public static void main(String[] args) {
        Duck duck = new Duck(new SimpleFly(), new SimpleQuack(), new DisplayAsText());
        duck.display();
        duck.fly();
        duck.quack();
    }
}
