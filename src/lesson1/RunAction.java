package lesson1;

import Obstacle.RunWay;

public class RunAction {
    public void pass(Obstacle obstacle) {

        if (obstacle instanceof RunWay) {
            RunWay runway = (RunWay) obstacle;
            if (racetrack.getDistance() <= maxDistance) {
                System.out.println("Игрок пробежал.");
                actionState = ActionState.VICTORY;
            } else {
                System.out.println("Игрок не смог пробежать. Может пробежать максимум: " + maxDistance);
                actionState = ActionState.BEAT;
            }
        }
    }

    public ActionState getActionState() {
        return actionState;
    }
}