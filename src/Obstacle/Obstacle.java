package Obstacle;

public class Obstacle {
    public static Object RunWayDistance;
    private int distance;

    public Obstacle(int distance) {
        this.distance = distance;
    }

    public String getObstacleName() {
        return this.getClass().getSimpleName();

    }
}