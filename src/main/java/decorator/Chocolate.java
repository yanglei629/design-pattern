package decorator;

public class Chocolate extends AddonDecorator {
    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 3;
    }
}
