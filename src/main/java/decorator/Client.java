package decorator;

public class Client {
    public static void main(String[] args) {
        Espresso espresso = new Espresso(); //5
        Chocolate chocolate = new Chocolate(espresso); //3
        Caramel caramel = new Caramel(chocolate);  //2

        System.out.println(caramel.cost());
    }
}
