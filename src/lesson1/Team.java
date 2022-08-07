package lesson1;

import java.lang.reflect.Member;

public class Team {
    private  String nickname;
    private Member[] members;

    public Team(String nickname, Member[] members) {
        this.nickname = nickname;
        this.members = members;
    }
    public void printingMembers(){
        System.out.println("члены команды:");
        for(Member member:members){
            System.out.println(member.getName());
        }
    }
}

