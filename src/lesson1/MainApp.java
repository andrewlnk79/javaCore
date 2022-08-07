package lesson1;

import Obstacle.Lake;
import Obstacle.Obstacle;

public class MainApp {
    private static  final int LakeDistance =150;
    private static  final int RunWayDistance =100;
    private  static final int WallDistance=15;

    public static void main(String[] args) {
        Course course= new Course( makeObstacles());
        Member[] members =makeMembers();
        Team team = new Team("Crazy Frog",members);
        team.printWinners();

    }
    public static Obstacle[] makeObstacles() {
        return new Obstacle[]{
                new Lake(LakeDistance),
                new RunWay(Obstacle.RunWayDistance),
                new Wall(WALLDISTANCE)
        };
    }
    public  static Member[] makeMembers(){
        return new Member[]{
                new Member("Nick",new MemberAction[]{SwimAction,JumpAction});
                new Member(("Mike",new MemberAction[]{RunAction}));
                new Member("Peter",new MemberAction[]{RunAction,JumpAction,SwimAction});
                new Member("Sofi",new MemberAction[]{SwimAction});


        }
    }
    public static MemberAction SwimAction(){
        SwimAction swimAction =new SwimAction(LakeDistance+30);
        return swimAction;
    }
    public  static MemberAction JumpAction(){
        JumpAction jumpAction = new JumpAction(WallDistance+2);
        return jumpAction;

    }
    public  static MemberAction RunAction(){
        RunAction runAction = new RunAction(RunWayDistance+30);
        return runAction;
    }

}
