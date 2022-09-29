package classesAndObjects.task9;

public class Main {
    static void fillBasket(Basket basket) {
        basket.addBall("Blue", 100);
        basket.addBall("Pink", 100);
        basket.addBall("Purple", 100);
        basket.addBall("Blue", 100);
        basket.addBall("Blue", 100);
        basket.addBall("Red", 100);
    }

    public static void main(String[] args) {
        Basket basket = new Basket();
        fillBasket(basket);
        int weight = basket.calculateWeight();
        System.out.printf("Weight of basket = %d\n", weight);
        int countOfBlue = basket.countBlueBalls();
        System.out.printf("Count of blue balls = %d", countOfBlue);
    }
}
