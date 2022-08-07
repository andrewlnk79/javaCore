package lesson1;

public class Member {
    private String name;
    private MemberAction[] MemberActions;

    public Member(String name, MemberAction[] memberActions) {
        this.name = name;
        MemberActions = memberActions;

    }
    public String getName() {
        return name;
    }
    public void tryToPassObstacle(Obstacle obstacle) {
        System.out.println(getName() + " пытается преодолеть " + obstacle.getObstacleName());
        for (MemberAction action : memberActions) {
            action.pass(obstacle);
        }

    }
    public boolean isWinner(){
        for (PlayerAction action : playerActions) {
            if (action.getActionState() == ActionState.NONE || action.getActionState() == ActionState.DEFEAT) {
                return false;
            }
        }
        return true;

    }
}

