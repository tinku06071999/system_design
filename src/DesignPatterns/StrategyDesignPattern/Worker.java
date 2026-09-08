package DesignPatterns.StrategyDesignPattern;

public class Worker extends Robot {

    public Worker(String name, WalkableRobot w, FlyAbleRobot f, TalkAbleRobot t) {
        super(name, w, t, f);
    }
    @Override
    public void projection() {
        System.out.println("Worker Robot is projecting a blueprint.");
    }
}
