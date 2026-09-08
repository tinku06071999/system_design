package DesignPatterns.StrategyDesignPattern;

public class Walk implements WalkableRobot {
    @Override
    public void walk() {
        System.out.println("Walking...");
    }
}
