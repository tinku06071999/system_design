package DesignPatterns.StrategyDesignPattern;

public class NotNormalWalk implements WalkableRobot {
    @Override
    public void walk() {
        System.out.println("I am walking in a not normal way.");
    }
}
