package lesson1;

public class JumpAction implements MemberAction {
    private int maxDistance;
    private ActionState actionState;
    public JumpAction(int maxDistance) {
        this.maxDistance = maxDistance;
        actionState = ActionState.NONE;
    }
        public void pass(Obstacle obstacle) {
            if (obstacle instanceof Wall) {
                Wall wall = (Wall) obstacle;
                if (wall.getDistance() <= maxDistance) {
                    System.out.println("Игрок прыгнул.");
                    actionState = ActionState.VICTORY;
                } else {
                    System.out.println("Игрок не смог прыгнуть. Может совершить прыжок максимум на " + maxDistance);
                    actionState = ActionState.BEAT;
                }
            }
        }
    public ActionState getActionState(){
        return actionState;}




