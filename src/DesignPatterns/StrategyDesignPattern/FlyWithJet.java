package DesignPatterns.StrategyDesignPattern;

public class FlyWithJet implements FlyAbleRobot {
    @Override
    public void fly() {
        System.out.println("I can fly with jet");
    }
}
