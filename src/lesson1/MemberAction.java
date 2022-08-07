package lesson1;

import Obstacle.Obstacle;

public interface MemberAction {

        void pass(Obstacle obstacle);
        ActionState getActionState();
    }

