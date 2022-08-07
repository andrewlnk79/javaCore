package lesson1;

import Obstacle.Lake;

public class SwimAction {
    public class SwimAction implements MemberAction {
        private int maxDistance;
        private ActionState actionState;

        public SwimAction(int maxDistance) {
            this.maxDistance = maxDistance;
            actionState = ActionState.NONE;
        }
        public void pass(Obstacle obstacle) {
            if (obstacle instanceof Lake) {
                Pool pool = (Lake) obstacle;
                if (pool.getDistance() <= maxDistance) {
                    System.out.println("Игрок проплыл.");
                    actionState = ActionState.VICTORY;
                } else {
                    System.out.println("Игрок не смог проплыть. Может проплыть максимум: " + maxDistance);
                    actionState = ActionState.BEAT;
                }
            }
        }
        public ActionState getActionState() {
            return actionState;
        }

}