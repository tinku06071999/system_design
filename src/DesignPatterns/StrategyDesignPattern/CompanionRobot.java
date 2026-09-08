package DesignPatterns.StrategyDesignPattern;

public class CompanionRobot extends Robot {
    public CompanionRobot(String name, WalkableRobot w, FlyAbleRobot f, TalkAbleRobot t) {
        super(name,w,t,f);
    }

   @Override
    public void projection() {
        System.out.println("Companion Robot is projecting a hologram.");
    }
}
