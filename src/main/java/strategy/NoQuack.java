package strategy;

public class NoQuack implements IQuackBehavior {
    public void quack() {
        System.out.println("no quack");
    }
}
