package strategy;

public class Duck {
    IFlyBehavior fb;
    IQuackBehavior qb;
    IDisplayBehavior db;

    public Duck(IFlyBehavior fb, IQuackBehavior qb, IDisplayBehavior db) {
        this.fb = fb;
        this.qb = qb;
        this.db = db;
    }

    public void display() {
        this.db.display();
    }

    public void fly() {
        this.fb.fly();
    }

    public void quack() {
        this.qb.quack();
    }
}
