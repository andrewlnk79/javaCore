package lesson1;

public class Team {
   private String name;
   private   member[] members;

    int run;
    int jump;

    public Team(String name, member[] members, int run, int jump) {
        this.name = name;
        this.members = members;
        this.run = run;
        this.jump = jump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public member[] getMembers() {
        return members;
    }

    public void setMembers(member[] members) {
        this.members = members;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }
}
}
