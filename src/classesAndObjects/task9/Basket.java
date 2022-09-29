package classesAndObjects.task9;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> listOfBalls;

    public Basket() {
        this.listOfBalls = new ArrayList<>();
    }

    public void addBall(String color, int weight) {
        Ball ball = new Ball(color, weight);
        this.listOfBalls.add(ball);
    }

    public int calculateWeight() {
        int weight = 0;
        for (Ball ball : this.listOfBalls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int countBlueBalls () {
        int count = 0;
        for (Ball ball : this.listOfBalls) {
            if (ball.getColor().equals("Blue")) {
                count++;
            }
        }
        return count;
    }
}
